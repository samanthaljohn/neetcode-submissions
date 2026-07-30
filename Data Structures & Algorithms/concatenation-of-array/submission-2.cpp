class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> concat_array = nums;
        concat_array.insert(concat_array.end(), nums.begin(), nums.end());
        return concat_array;
    }
};