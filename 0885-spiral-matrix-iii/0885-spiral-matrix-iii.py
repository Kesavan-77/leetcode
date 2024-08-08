from typing import List
class Solution:
    def spiralMatrixIII(self, rows: int, cols: int, rStart: int, cStart: int) -> List[List[int]]:
        lptr, rptr = cStart, cStart
        topptr, bottomptr = rStart, rStart
        ans = [[0, 0] for _ in range(rows * cols)]
        index = 0
        ans[index][0] = rStart
        ans[index][1] = cStart
        index += 1
        while index < (rows * cols):
            # right
            rptr += 1
            for i in range(lptr + 1, rptr + 1):
                if topptr >= 0 and i >= 0 and i < cols:
                    ans[index][0] = topptr
                    ans[index][1] = i
                    index += 1
            # bottom
            bottomptr += 1
            for i in range(topptr + 1, bottomptr + 1):
                if rptr < cols and i >= 0 and i < rows:
                    ans[index][0] = i
                    ans[index][1] = rptr
                    index += 1
            # left
            lptr -= 1
            for i in range(rptr - 1, lptr - 1, -1):
                if bottomptr < rows and i >= 0 and i < cols:
                    ans[index][0] = bottomptr
                    ans[index][1] = i
                    index += 1
            # top
            topptr -= 1
            for i in range(bottomptr - 1, topptr - 1, -1):
                if lptr >= 0 and i >= 0 and i < rows:
                    ans[index][0] = i
                    ans[index][1] = lptr
                    index += 1
        return ans
