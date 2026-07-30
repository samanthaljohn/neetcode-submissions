class Solution:
    def countSeniors(self, details: List[str]) -> int:
        old_people = 0
        for detail in details:
            if int(detail[11:13]) > 60:
                old_people += 1
        return old_people

        