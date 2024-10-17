class Solution {
    public int maximumSwap(int num) {
        String[] arr = Integer.toString(num).split("");
        for(int i=0;i<arr.length-1;i++){
            int max = -1;
            int idx = -1;
            for(int j=i+1;j<arr.length;j++){
                if(Integer.parseInt(arr[i])<Integer.parseInt(arr[j]) && Integer.parseInt(arr[j])>=max){
                    idx = j;
                    max = Integer.parseInt(arr[j]);
                }
            }
            if(idx>=0){
                String temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                return Integer.parseInt(String.join("",arr));
            }
        }
        return num;
    }
}