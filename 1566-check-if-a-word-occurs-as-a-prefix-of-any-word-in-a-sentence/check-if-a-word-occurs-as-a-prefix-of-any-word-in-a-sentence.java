class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;

        /*sentence = " " + sentence;
        int count = 0;
        for(int i=1;i<sentence.length();i++){
            int j = 0;
            if(sentence.charAt(i-1) == ' '){
                count++;
                while(j<searchWord.length() && i<sentence.length()){
                    if(sentence.charAt(i) == searchWord.charAt(j)){
                        i++;
                        j++;
                    }
                    else break;
                }
                if(j==searchWord.length()) return count;
            }
        }
        return -1; */
    }
}