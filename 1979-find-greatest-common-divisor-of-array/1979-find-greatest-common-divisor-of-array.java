class Solution {
    public int GCD(int a, int b){
        if(b%a==0) return a;
        return GCD(b%a, a);
    }
    public int findGCD(int[] nums) {
        int a = 10000;
        int b = -1;
        for(int i: nums){
            if(i<a) a = i;
            if(i>b) b = i;
        }
        return GCD(a,b);
    }
}