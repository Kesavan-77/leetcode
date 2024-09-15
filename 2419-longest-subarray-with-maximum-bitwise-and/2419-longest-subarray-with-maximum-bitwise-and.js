/**
 * @param {number[]} nums
 * @return {number}
 */
var longestSubarray = function(nums) {
    let maxNumber = Math.max(...nums);
    let res = 0, ans = 0;
    for(let val of nums){
        if(val===maxNumber){
            ans++;
            res = Math.max(res,ans);
        } else ans = 0;
    }
    return res;
};