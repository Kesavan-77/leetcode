class Solution {
    public long sumArray(int[] arr){
        long total = 0;
        for(int val : arr){
            total += val;
        }
        return total;
    }
    public int minSubarray(int[] nums, int p) {
        long remainder = sumArray(nums) % p;
        System.out.println(sumArray(nums) + " " + remainder);
        if (remainder == 0) return 0;
        int res = nums.length;
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);
        long curr_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            curr_sum = (curr_sum + nums[i]) % p;
            long prefix = (curr_sum - remainder + p) % p;
            if (map.containsKey(prefix)) {
                long length = i - map.get(prefix);
                res = Math.min(res, (int) length); 
            }
            map.put(curr_sum, i);
        }
        return res == nums.length ? -1 : res;
    }
}
