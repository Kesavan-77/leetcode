class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);
        int res = 0;
        int currSum = 0;
        for(int val : nums){
            currSum += val;
            int rem = currSum % k;
            if(rem < 0) rem += k;
            res += prefixSum.getOrDefault(rem, 0);
            prefixSum.put(rem, prefixSum.getOrDefault(rem, 0) + 1);
        }
        
        return res;
    }
}
