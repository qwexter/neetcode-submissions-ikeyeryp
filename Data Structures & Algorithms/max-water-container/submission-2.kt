import kotlin.math.min
import kotlin.math.max

class Solution {
    fun maxArea(heights: IntArray): Int { // [2,2,2]
        var max = 0
        var l = 0
        var r = heights.size - 1

        // l == 0; r == 2
        while (l < r) {
            val minH = min(heights[l], heights[r]) // 2 or 2 -> 2
            val d = r - l // 2-0 -> 2
            max = max(max, d * minH)
            if (heights[l] <= heights[r]) {
                l++
            } else {
                r--
            }
        }
        return max
    }
}
