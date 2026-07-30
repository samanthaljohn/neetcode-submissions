class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int current = 0;
        int max_ones = 0;

        for (int num : nums){
            if (num == 1){
                current++;
                max_ones = std::max(current, max_ones);
            } else {
                current = 0;
            }
        }

        return max_ones;
    }
};