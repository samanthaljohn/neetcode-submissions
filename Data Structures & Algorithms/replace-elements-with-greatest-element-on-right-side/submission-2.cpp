class Solution {
public:
    // o (n)
    vector<int> replaceElements(vector<int>& arr) {
        int right_max = -1;
        for (int i = arr.size() - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = right_max;

            if (temp > right_max){
                right_max = temp;
            }
        }

        arr[arr.size() - 1] = -1;
        return arr;
    }
};