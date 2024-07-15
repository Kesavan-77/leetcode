class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        smap = {}
        tmap = {}
        res = 0
        for i in range(len(s)):
            smap[s[i]] = i
            tmap[t[i]] = i
        for val in s:
            res += abs(smap[val]-tmap[val])
        return res