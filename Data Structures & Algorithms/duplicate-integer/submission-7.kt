class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        buildSet(nums.size) {
            nums.forEach { if (!add(it)) return true }
        }
        return false
    }
}
