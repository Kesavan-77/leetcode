class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] res = new int[k];
        for(int val : arr){
            res[(val%k+k)%k]++;
        }
        if(res[0]%2==1) return false;
        for(int i=1;i<k;i++){
            if(res[i]!=res[k-i]) return false;
        }
        return true;
    }
}