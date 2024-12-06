class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int[] arr=new int[10001];
        for(int i=0; i<banned.length; i++){
            arr[banned[i]]=1;
        }
        long total=0;
        int res=0;
        for(int i=1; i<=n; i++){
            if(arr[i]!=1){
                total+=i;
                if(total>maxSum){
                    break;
                }
                res++;
            }
        }
        return res;

        // HashSet<Integer> set = new HashSet<>();
        // for(int i:banned){
        //     set.add(i);
        // }
        // int res = 0,sum=0;
        // for(int i=1;i<=n;i++){
        //     if(!set.contains(i)){
        //         if(sum+i<=maxSum){
        //             sum+=i;
        //             res++;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return res;
    }
}