class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            int[] temp = Arrays.copyOfRange(arr, i + 1, arr.length);

            arr[i] = Arrays.stream(temp).max().getAsInt();
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}