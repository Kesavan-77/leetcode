class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0,j=0;
        while(j<str2.length() && i<str1.length()){
            if(str1.charAt(i)==str2.charAt(j) || str1.charAt(i)+1 == str2.charAt(j)+0 || str1.charAt(i)-25 == str2.charAt(j)+0){
                i++;
                j++;
                if(j>str2.length()-1) return true;
            } else {
                i++;
            }
        }
        return false;
    }
}