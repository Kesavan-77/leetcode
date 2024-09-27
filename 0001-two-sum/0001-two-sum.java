class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int need = target - nums[i];
            if(map.containsKey(-(-need))) {
                res[0] = map.get(-(-need));
                res[1] = i;
                return res;
            } else {
                map.put(-(-nums[i]),i);
            }
        }
        return res;
    }
}