class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> unique_nums = new HashSet<>();

        for (int num : nums){
            if (unique_nums.contains(num)){
                return true;
            } else {
                unique_nums.add(num);
            }
        }

        return false;
    }
}