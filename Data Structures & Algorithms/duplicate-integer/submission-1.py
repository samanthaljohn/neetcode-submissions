class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        already_occurred = []
        for num in nums:
            if num in already_occurred:
                return True
            already_occurred.append(num)
        return False