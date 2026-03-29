class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        nums.sorted()
        for (i in 1..<nums.size) {
            if (nums[i-1] == nums[i]) return true
        }
        return nums.size != nums.toSet().size
    }
}
