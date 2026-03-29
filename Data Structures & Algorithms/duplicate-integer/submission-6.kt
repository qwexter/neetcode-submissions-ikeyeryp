class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val store = mutableSetOf<Int>()
        nums.forEach {
            if (!store.add(it)) return true
        }
        return false
    }
}
