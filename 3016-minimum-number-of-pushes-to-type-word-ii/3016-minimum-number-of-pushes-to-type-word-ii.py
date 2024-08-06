class Solution:
    def minimumPushes(self, word: str) -> int:
        from collections import Counter
        res = 0
        counter = Counter(word)
        sorted_counter = sorted(counter.items(), key=lambda x: x[1], reverse=True)
        pressCount = 1
        buttonCount = 1
        print(sorted_counter)
        for val in sorted_counter:
            res+= val[1]*pressCount
            if(buttonCount%8==0):
                pressCount+=1
                buttonCount = 0
            buttonCount+=1
        return res