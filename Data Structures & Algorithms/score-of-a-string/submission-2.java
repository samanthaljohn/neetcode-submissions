class Solution {
    public int scoreOfString(String s) {
        char[] chars = s.toCharArray();

        int sum = 0;

        for (int i = 0; i < chars.length - 1; i++){
            int ascii_right = (int) chars[i];
            int ascii_left = (int) chars[i + 1];

            sum = sum + Math.abs(ascii_right - ascii_left);
        }

        return sum;
    }
}