class Solution {
    public int[] replaceElements(int[] arr) {
        int right_max = -1;
        for (int i = arr.length - 1; i >= 0; i --){
            int temp = arr[i];
            arr[i] = right_max;

            if (temp > right_max){
                right_max = temp;
            }
        }
        return arr;
    }
}