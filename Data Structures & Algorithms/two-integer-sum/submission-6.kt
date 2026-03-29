class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val store = mutableMapOf<Int, Int>()

        for (i in 0 ..< nums.size) {
            val n = nums[i]
            val diff = target - n
            if (store[diff] != null) {
                return intArrayOf(store[diff]!!, i)
            }
            store[n] = i
        }
        return intArrayOf()
    }
}
