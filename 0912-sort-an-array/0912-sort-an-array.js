/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArray = function(nums) {
    function quickSort(arr, low, high) {
        if (high <= low) return arr;
        let start = low;
        let end = high;
        let mid = Math.floor((low + high) / 2);
        let pivot = arr[mid];
        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if (start <= end){
                [arr[start], arr[end]] = [arr[end], arr[start]];
                start++;
                end--;
            }
        }
        quickSort(arr, low, end);
        quickSort(arr, start, high);
        return arr;
    }

    return quickSort(nums, 0, nums.length - 1);
};

