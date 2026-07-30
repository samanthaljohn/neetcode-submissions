class Solution:
    def scoreOfString(self, s: str) -> int:
        sum = 0
        for i in range(0, len(s) - 1):
            ascii_left = ord(s[i])
            ascii_right = ord(s[i + 1])

            sum += abs(ascii_left - ascii_right)
        return sum
        