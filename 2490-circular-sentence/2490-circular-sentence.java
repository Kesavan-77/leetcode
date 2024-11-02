class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        int start = 0;
        while(start<arr.length-1){
            if(arr[start].charAt(arr[start].length()-1) != arr[start+1].charAt(0)){
                return false;
            }
            start++;
        }
        if(arr[start].charAt(arr[start].length()-1) != arr[0].charAt(0)){
            return false;
        }
        return true;
    }
}