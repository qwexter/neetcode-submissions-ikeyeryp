class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val store = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val diff = target - nums[i]
            val second = store[diff]
            if (second != null) {
                return intArrayOf(second, i)
            }
            store[nums[i]] = i
        }
        return intArrayOf()
    }
}