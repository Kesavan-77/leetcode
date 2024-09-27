class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int start=0,end=0;
        int res = nums[0],count=1;
        while(end<nums.length){
            if(end==nums.length-1 || nums[end]!=nums[end+1]){
                if(end-start+1 > count) {
                    res = nums[end-1];
                    count = end-start+1;
                }
                start = end;
            }
            end++;
        }
        return res;
    }
}