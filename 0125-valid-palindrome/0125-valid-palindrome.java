class Solution {
   public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    String s1 = "";
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if ((c >= 'a' && c <= 'z') || (c>='0' && c<='9')) {
            s1 += c;
        }
    }
    int n = s1.length();
    System.out.println(s1);
    for (int i = 0; i < n / 2; i++) {
        if (s1.charAt(i) != s1.charAt(n - i - 1)) {
            return false;
        }
    }
    return true;
}
}