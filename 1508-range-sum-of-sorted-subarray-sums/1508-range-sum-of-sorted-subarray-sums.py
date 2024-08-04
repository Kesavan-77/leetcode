class Solution:
    def rangeSum(self, nums: List[int], n: int, left: int, right: int) -> int:
        n = len(nums)
        for i in range(n-1):
            total = nums[i]
            for j in range(i+1,n):
                total+=nums[j]
                nums.append(total)
        nums.sort()
        return (sum(nums[left-1:right]))%1000000007
        