class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int left = 0, right = n-1, end = n-1;
        while(left<=right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                arr[end--] = nums[left] * nums[left];
                left++;
            }
            else {
                arr[end--] = nums[right] * nums[right];
                right--;
            }
        }
        return arr;
    }
}