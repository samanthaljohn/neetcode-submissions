class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concat_array = new int[nums.length * 2];

        System.arraycopy(nums, 0, concat_array, 0, nums.length);
        System.arraycopy(nums, 0, concat_array, nums.length, nums.length);
        
        return concat_array;
    }
}