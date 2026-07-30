class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        words.sort(key = len);

        substrings = []
        for i in range(0, len(words)):
            word = words[i]
            for j in range(i + 1, len(words)):
                longer_word = words[j]
                if word in longer_word:
                    substrings.append(word)
                    break;
        
        return substrings


        