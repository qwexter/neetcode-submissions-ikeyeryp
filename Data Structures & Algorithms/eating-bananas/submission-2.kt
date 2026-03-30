class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var r = piles.max()
        var l = 1
        while (l < r) {
            val m = l + (r - l) / 2
            val sum = piles.sumOf { (it + m - 1) / m }
            if (sum <= h) {
                r = m
            } else {
                l = m + 1
            }
        }
        return l
    } 
}
