/**
 * @param {number[]} nums
 * @return {number[]}
 */
var frequencySort = function (nums) {
    let map = new Map();
    let res = [];

    for (let val of nums) {
        map.has(val) ? map.set(val, map.get(val) + 1) : map.set(val, 1);
    }

    let sortedMap = new Map([...map.entries()]
        .sort((a, b) => a[1] - b[1] === 0 ? b[0] - a[0] : a[1] - b[1]));

    console.log(sortedMap)
    sortedMap.forEach((value, key) => {
        for (let i = 0; i < value; i++) res.push(key);
    });

    return res;
};