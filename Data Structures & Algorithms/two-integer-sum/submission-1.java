class Solution {
    public int[] twoSum(int[] nums, int target) {
        final Map map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            final int diff = target - nums[i];
            final Integer stored = (Integer)map.get(diff);
            if (stored != null) {
                return new int[]{stored, i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0, 1};
    }
}
