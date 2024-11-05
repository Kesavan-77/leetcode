class Solution {
    public int minChanges(String s) {
        int res = 0;
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i)!=s.charAt(i+1)) res++;
            i+=2;
        }
        return res;
    }
}