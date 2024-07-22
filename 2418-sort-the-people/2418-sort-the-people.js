/**
 * @param {string[]} names
 * @param {number[]} heights
 * @return {string[]}
 */
var sortPeople = function(names, heights) {
    if (heights.length <= 1) {
        return names;
    }

    const pivotIdx = Math.floor(heights.length / 2);
    const pivotHeight = heights[pivotIdx];
    const pivotName = names[pivotIdx];

    let leftNames = [];
    let rightNames = [];
    let leftHeights = [];
    let rightHeights = [];

    for (let i = 0; i < heights.length; i++) {
        if (i === pivotIdx) continue;

        if (heights[i] > pivotHeight) {
            leftNames.push(names[i]);
            leftHeights.push(heights[i]);
        } else {
            rightNames.push(names[i]);
            rightHeights.push(heights[i]);
        }
    }

    const sortedLeft = sortPeople(leftNames, leftHeights);
    const sortedRight = sortPeople(rightNames, rightHeights);

    return sortedLeft.concat([pivotName], sortedRight);
};
