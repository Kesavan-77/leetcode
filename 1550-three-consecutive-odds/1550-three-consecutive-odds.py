class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        if(len(arr)<2):
            return False
        res = 0
        for val in arr:
            if val&1:
                res += 1
                if res==3:
                    return True
            else:
                res = 0
        return False