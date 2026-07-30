class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        count = 1
        order = []
        for s_char in s:
            found = False
            for i in range(0, len(t)):
                t_char = t[i]
                if s_char == t_char:
                    order.append(count);
                    count += 1;
                    found = True
                    t = t[i + 1:]
                    break;
            if found == False: return False;
        return order == sorted(order)


        