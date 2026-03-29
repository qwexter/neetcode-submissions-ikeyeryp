class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val store = mutableSetOf<Int>()
        for (n in nums) {
            if (!store.add(n)) return true
        }
        return false
    }
}
