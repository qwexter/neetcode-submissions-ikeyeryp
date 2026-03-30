class Solution {
    fun search(nums: IntArray, target: Int): Int { // nums=[-1,0,2,4,6,8] target = 4
        var result = -1

        var l = 0
        var r = nums.size - 1

        while (l <= r) {
            val m = l + (r - l) / 2

            if (nums[m] == target) {
                result = m
                break
            } else if (nums[m] < target) {
                l = m + 1
            } else {
                r = m - 1
            }
        }

        return result
   }
}
