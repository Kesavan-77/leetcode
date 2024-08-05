class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        from collections import Counter
        map = Counter(arr)
        for key in map.keys():
            if(map[key]==1):
                if(k==1):
                    return key
                k-=1
        return ""
    
        # map = {}
        # for word in arr:
        #     if word in map:
        #         map[word] += 1
        #     else:
        #         map[word] = 1
        # for key in map.keys():
        #     if(map[key]==1):
        #         if(k==1):
        #             return key
        #         k-=1
        # return ""