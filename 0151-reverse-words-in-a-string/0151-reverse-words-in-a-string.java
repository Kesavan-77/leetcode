class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int start = s.length() - 1;
        int end = s.length();
        String res = "";
        while (start >= 0) {
            if (s.charAt(start) == ' ') {
                res += s.substring(start + 1, end) + " ";
                while (start >= 0 && s.charAt(start) == ' ') {
                    start--;
                }
                end = start + 1;
            }
            start--;
        }
        res += s.substring(0, end);
        return res;
    }
}
