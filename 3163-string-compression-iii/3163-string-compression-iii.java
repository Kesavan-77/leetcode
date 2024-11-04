class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int count = 1;
        int n = word.length();
        for (int i = 0; i < n - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
                if (count == 9 && i+1 != n-1) {
                    comp.append(count).append(word.charAt(i));
                    count = 1;
                    i++;
                }
            } else {
                comp.append(count).append(word.charAt(i));
                count = 1;
            }
        }
        comp.append(count).append(word.charAt(n - 1));
        return comp.toString();
    }
}
