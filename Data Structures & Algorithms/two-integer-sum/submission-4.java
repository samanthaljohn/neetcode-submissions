class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (pairs.containsKey(diff)){
                int[] res = new int[] {pairs.get(diff), i};
                return res;
            }
            
            pairs.put(nums[i], i);
        }

        return new int[]{};
    }
}
