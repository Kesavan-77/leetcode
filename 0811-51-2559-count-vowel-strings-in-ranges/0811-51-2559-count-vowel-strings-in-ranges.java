class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int[] res = new int[queries.length];
        int[] prefixVal = new int[words.length];
        int prefixSum = 0;
        for(int i=0;i<words.length;i++){
            if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length()-1))){
                prefixSum++;
            }
            prefixVal[i] = prefixSum;
            System.out.println(prefixVal[i]);
        }
        for(int i=0;i<queries.length;i++){
            res[i] = prefixVal[queries[i][1]] - (queries[i][0] == 0 ? 0 : prefixVal[queries[i][0] - 1]);
        }
        return res;
    }
}