class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0, end = 0;
        while(end<nums.length){
            if(nums[start]==0 && nums[end]!=0){
                nums[start] = nums[start] + nums[end];
                nums[end] = nums[start] - nums[end];
                nums[start] = nums[start] - nums[end];
                start++;
            }else if(nums[start]!=0){
                start++;
            }
            end++;
        }
    }
}