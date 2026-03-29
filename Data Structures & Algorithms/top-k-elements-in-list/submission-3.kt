class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val store = mutableMapOf<Int, Int>()
        for (n in nums) {
            store[n] = (store[n] ?: 0) + 1
        }
        val tmp = store.toList().sortedByDescending {(k, v) -> v}
        val result = IntArray(k)
        for (i in 0..<k) {
            result[i] = tmp[i].first
        }
        return result
    }
}
