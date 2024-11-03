class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<goal.length();i++){
            if(goal.charAt(i) == s.charAt(0)){
                String res = goal.substring(i) + goal.substring(0,i);
                if(res.compareTo(s) == 0) return true;
            }
        }
        return false;
    }
}