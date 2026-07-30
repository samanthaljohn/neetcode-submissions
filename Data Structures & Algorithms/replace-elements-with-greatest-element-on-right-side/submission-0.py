class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        for i in range(0, len(arr) - 1):
            temp = arr[i + 1:]
            max_value = max(temp)

            arr[i] = max_value
        arr[-1] = -1
        return arr    