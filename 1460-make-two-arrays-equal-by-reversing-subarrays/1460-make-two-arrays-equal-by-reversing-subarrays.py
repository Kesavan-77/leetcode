class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        def mergeSort(arr):
            if(len(arr)<=1):
                return arr
            n = len(arr)
            mid = n//2
            left = arr[:mid]
            right = arr[mid:n]
            leftArr = mergeSort(left)
            rightArr = mergeSort(right)
            return merge(leftArr, rightArr)
        def merge(leftArr,rightArr):
            i,j = 0,0
            res = []
            while(i<len(leftArr) and j<len(rightArr)):
                if(leftArr[i]<rightArr[j]):
                    res.append(leftArr[i])
                    i+=1
                else:
                    res.append(rightArr[j])
                    j+=1
            while(i<len(leftArr)):
                res.append(leftArr[i])
                i+=1
            while(j<len(rightArr)):
                res.append(rightArr[j])
                j+=1
            return res
        arr1 = mergeSort(target)
        arr2 = mergeSort(arr)
        for i in range(len(arr1)):
            if(arr1[i]!=arr2[i]):
                return False
        return True