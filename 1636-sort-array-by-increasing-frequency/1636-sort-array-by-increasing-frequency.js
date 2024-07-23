/**
 * @param {number[]} nums
 * @return {number[]}
 */
var frequencySort = function (nums) {
    const map = new Map();

    for (let val of nums) {
        map.set(val, (map.get(val) || 0) + 1);
    }

    return nums.sort((a, b) => {
        const freqA = map.get(a);
        const freqB = map.get(b);
        return freqA === freqB ? b - a : freqA - freqB;
    });
};