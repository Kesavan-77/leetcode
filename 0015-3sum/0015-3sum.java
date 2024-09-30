import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        for (int start = 0; start < n - 2; start++) {
            int mid = start + 1;
            int end = n - 1;
            while (mid < end) {
                int val = nums[start] + nums[mid] + nums[end];
                if (val == 0) {
                    result.add(Arrays.asList(nums[start], nums[mid], nums[end]));
                    mid++;
                    end--;
                    while (mid < end && nums[mid] == nums[mid - 1]) {
                        mid++;
                    }
                    while (mid < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                }
                else if (val > 0) {
                    end--;
                }
                else {
                    mid++;
                }
            }
            while (start < n - 2 && nums[start] == nums[start + 1]) {
                start++;
            }
        }
        return new ArrayList<>(result);
    }
}
