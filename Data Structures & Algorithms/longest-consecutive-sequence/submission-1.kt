class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        var max = 0

        val lookup = mutableMapOf<Int, Boolean>()

        for (n in nums) {
            lookup[n] = true
        }

        for (n in nums) {
            var i = 1
            var k = n + 1
            while (k in lookup) {
                i++
                k++
            }
            if (i > max) {
                max = i
            }
        }

        return max
    }
}
