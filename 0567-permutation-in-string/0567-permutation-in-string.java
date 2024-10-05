class Solution {
    public boolean checkCount(int[] arr, String s){
        for(char st : s.toCharArray()){
            if(arr[st-'a'] != 0){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        int n1 = s1.length(), n2 = s2.length();
        if(n1 > n2) {
            return false;
        }
        for(char code : s1.toCharArray()){
            count[code - 'a'] += 1;
        }
        int start = 0, end = 0;
        while(end<n1){
            count[s2.charAt(end) - 'a'] -= 1;
            end++;
        }
        if(checkCount(count, s1)){
            return true;
        }
        while(end<n2){
            count[s2.charAt(end) - 'a'] -= 1;
            count[s2.charAt(start) - 'a'] += 1;
            end++;
            start++;
            if(checkCount(count, s1)){
                return true;
            }
        }
        return false;
    }
}