class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        for (int i = 0; i < arr.size() - 1; i++){
            vector<int> tempArr(arr.begin() + i + 1, arr.end());

            auto maxIter = max_element(tempArr.begin(), tempArr.end());
            int maxNum = *maxIter;
            arr[i] = maxNum;
        }

        arr[arr.size() - 1] = -1;
        return arr;
    }
};