/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum = (nums, target) => {
    const map = new Map();
    for (let i = 0; i < nums.length; map.set(nums[i], i++))
        if (map.has(target - nums[i])) return [map.get(target - nums[i]), i];
};