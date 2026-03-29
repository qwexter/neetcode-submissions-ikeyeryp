class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        for (i in 0..<nums.size) {
            if (!set.add(nums[i])) return true
        }
        return false
    }
}
