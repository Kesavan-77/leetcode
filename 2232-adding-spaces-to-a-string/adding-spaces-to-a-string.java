class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = 0;
        StringBuilder ans = new StringBuilder(s);
        for(int i=0;i<spaces.length;i++){
            ans.insert(spaces[i] + i, " ");
        }
        return ans.toString();
    }
}