class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        var max = 0

        val lookup = nums.toSet()

        for (n in nums) {
            var i = 1
            while (n + i in lookup) {
                i++
            }
            if (i > max) {
                max = i
            }
        }
        return max
    }
}
