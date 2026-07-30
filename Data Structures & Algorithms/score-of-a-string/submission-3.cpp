class Solution {
public:
    int scoreOfString(string s) {
        int sum = 0;
        
        for (int i = 0; i < s.length() - 1; i++){
            int ascii_right = static_cast<int>(s[i]);
            int ascii_left = static_cast<int>(s[i + 1]);

            sum = sum + abs(ascii_right - ascii_left);
        }

        return sum;
    }
};