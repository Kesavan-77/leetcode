class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int start = 0, end = x, result = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long)mid * mid == x) {
                return mid;
            } 
            else if ((long)mid * mid < x) {
                result = mid;
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return result;
    }
}
