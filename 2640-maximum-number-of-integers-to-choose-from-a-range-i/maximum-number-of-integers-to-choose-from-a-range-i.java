class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:banned){
            set.add(i);
        }
        int res = 0,sum=0;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                if(sum+i<=maxSum){
                    sum+=i;
                    res++;
                }
                else{
                    break;
                }
            }
        }
        return res;
    }
}