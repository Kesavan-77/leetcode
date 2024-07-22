/**
 * @param {string[]} names
 * @param {number[]} heights
 * @return {string[]}
 */
var sortPeople = function(names, heights) {
    quicksort(0, heights.length - 1);
    return names;

    function quicksort(left, right) {
        if (left >= right) return;

        const pivotIdx = partition(left, right);
        quicksort(left, pivotIdx - 1);
        quicksort(pivotIdx + 1, right);
    }

    function partition(left, right) {
        const pivotHeight = heights[right];
        const pivotName = names[right];
        let i = left - 1;

        for (let j = left; j < right; j++) {
            if (heights[j] > pivotHeight) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, right);
        return i + 1;
    }

    function swap(i, j) {
        [heights[i], heights[j]] = [heights[j], heights[i]];
        [names[i], names[j]] = [names[j], names[i]];
    }
};
