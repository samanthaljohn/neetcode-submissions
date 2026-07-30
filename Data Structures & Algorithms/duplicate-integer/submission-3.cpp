class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> unique_nums;

        for (int num : nums) {
            if (unique_nums.find(num) != unique_nums.end()){
                return true;
            } else {
                unique_nums.insert(num);
            }
        }
        
        return false;
    }
};