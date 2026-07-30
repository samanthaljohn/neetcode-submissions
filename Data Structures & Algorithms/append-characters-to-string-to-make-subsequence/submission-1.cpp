class Solution {
public:
    int appendCharacters(string s, string t) {
        int sPtr = 0, tPtr = 0;

        while (sPtr < s.length() && tPtr < t.length()){
            if (s[sPtr] == t[tPtr]){
                tPtr++;
            }
            sPtr++;
        }

        return t.length() - tPtr;
    }
};