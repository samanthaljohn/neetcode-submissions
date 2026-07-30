class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        min_chars = 0

        s_loc = 0
        t_loc = 0

        while s_loc < len(s) and t_loc < len(t):
            if s[s_loc] == t[t_loc]:
                s_loc += 1
                t_loc += 1
            else:
                s_loc += 1

        min_chars = len(t) - t_loc
        return min_chars

        