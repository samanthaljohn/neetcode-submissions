class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> pairs;

        for (int i = 0; i < nums.size(); i++) {
            int diff = target - nums[i];
            
            if (pairs.find(diff) != pairs.end()) {
                vector<int> res = {pairs[diff], i};
                return res;
            }

            pairs.insert({nums[i], i});
        }
        
        return {};
    }
};
