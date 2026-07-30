class Solution:
    # o(n)
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        pairs = {}
        for i in range(0, len(nums)):
            diff = target - nums[i]
            if diff in pairs:
                return sorted([i, pairs[diff]])
            else:
                pairs[nums[i]] = i
        