class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int n = words.length;
        int[] prefixVal = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixVal[i + 1] = prefixVal[i] + (isVowelString(words[i], vowels) ? 1 : 0);
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1] + 1; 
            res[i] = prefixVal[right] - prefixVal[left];
        }
        return res;
    }
    private boolean isVowelString(String word, Set<Character> vowels) {
        return vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1));
    }
}
