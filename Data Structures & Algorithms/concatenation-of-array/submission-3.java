class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concat_array = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            concat_array[i] =  nums[i];
            concat_array[i + nums.length] = nums[i];
        }

        return concat_array;
    }
}