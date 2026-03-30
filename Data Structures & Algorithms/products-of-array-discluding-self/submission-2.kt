class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val left = IntArray(nums.size)
        val right = IntArray(nums.size)

        var acc = 1

        for (i in nums.indices) {
            left[i] = acc
            acc *= nums[i]
        }
        acc = 1
        for (i in nums.size - 1 downTo 0) {
            right[i] = acc
            acc *= nums[i]
        }

        val result = IntArray(nums.size)
        for (i in nums.indices) {
            result[i] = left[i] * right[i]
        }
        return result
    }
}
