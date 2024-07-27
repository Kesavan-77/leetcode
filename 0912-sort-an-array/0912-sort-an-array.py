class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        def mergeSort(arr):
            if len(arr)<=1:
                return arr
            mid = len(arr)//2
            leftArr = arr[:mid]
            rightArr = arr[mid:len(arr)]
            sortedLeftArr = mergeSort(leftArr)
            sortedRightArr = mergeSort(rightArr)
            return merge(sortedLeftArr, sortedRightArr)
        def merge(leftArr, rightArr):
            i,j = 0,0
            resArr = []
            while i < len(leftArr) and j < len(rightArr):
                if leftArr[i]<rightArr[j]:
                    resArr.append(leftArr[i])
                    i+=1
                else:
                    resArr.append(rightArr[j])
                    j+=1
            while i<len(leftArr):
                resArr.append(leftArr[i])
                i+=1
            while j<len(rightArr):
                resArr.append(rightArr[j])
                j+=1
            return resArr
        return mergeSort(nums)