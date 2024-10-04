class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);
        int res = 0;
        int currSum = 0;
        for(int val : nums){
            currSum += val;
            int rem = currSum - k;
            res += prefixSum.getOrDefault(rem, 0);
            prefixSum.put(currSum, prefixSum.getOrDefault(currSum, 0) + 1);
        }
        return res;
    }
}