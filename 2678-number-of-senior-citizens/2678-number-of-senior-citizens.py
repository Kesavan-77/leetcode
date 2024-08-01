class Solution:
    def countSeniors(self, details: List[str]) -> int:
        count = 0
        for data in details:
            if int(data[11:13])>60:
                count+=1
        return count