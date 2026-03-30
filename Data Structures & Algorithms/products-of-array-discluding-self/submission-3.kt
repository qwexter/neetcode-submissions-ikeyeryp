class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        var acc = 1

        for (i in nums.indices) {
            result[i] = acc
            acc *= nums[i]
        }
        acc = 1
        for (j in nums.size - 1 downTo 0) {
            result[j] = result[j] * acc
            acc *= nums[j]
        }
        return result
    }
}
