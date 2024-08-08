from typing import List

class Solution:
    def spiralMatrixIII(self, rows: int, cols: int, rStart: int, cStart: int) -> List[List[int]]:
        leftPointer, rightPointer = cStart, cStart
        topPointer, bottomPointer = rStart, rStart
        res = []
        res.append([rStart, cStart])
        index = 1
        while index < (rows * cols):

            rightPointer += 1
            i = leftPointer + 1
            while i <= rightPointer:
                if topPointer >= 0 and i >= 0 and i < cols:
                    res.append([topPointer, i])
                    index += 1
                i += 1

            bottomPointer += 1
            i = topPointer + 1
            while i <= bottomPointer:
                if rightPointer < cols and i >= 0 and i < rows:
                    res.append([i, rightPointer])
                    index += 1
                i += 1

            leftPointer -= 1
            i = rightPointer - 1
            while i >= leftPointer:
                if bottomPointer < rows and i >= 0 and i < cols:
                    res.append([bottomPointer, i])
                    index += 1
                i -= 1

            topPointer -= 1
            i = bottomPointer - 1
            while i >= topPointer:
                if leftPointer >= 0 and i >= 0 and i < rows:
                    res.append([i, leftPointer])
                    index += 1
                i -= 1

        return res
