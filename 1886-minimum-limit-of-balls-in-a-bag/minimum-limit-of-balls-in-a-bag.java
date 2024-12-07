class Solution {
    public int minimumSize(int[] nums, int maxOps) {
        int left = 1, right = Arrays.stream(nums).max().getAsInt();
        while (left < right) {
            int mid = left + (right - left) / 2;
            int requiredOps = 0;
            for (int num : nums) {
                requiredOps += (num - 1) / mid;
            }
            if (requiredOps <= maxOps) {
                right = mid;
            } else {
                left = mid + 1; 
            }
        }
        return left;
    }
}
