/**
 * @param {number[]} arr
 * @param {number} k
 * @param {number} threshold
 * @return {number}
 */
var numOfSubarrays = function (arr, k, threshold) {
    let i = 0, j = 0;
    let ans = 0;
    let avg = 0;
    while (j < k) {
        avg += arr[j++];
    }
    if (avg / k >= threshold) ans += 1;
    while (j < arr.length) {
        avg += arr[j++] - arr[i++];
        if (avg / k >= threshold) ans += 1;
    }
    return ans;
};