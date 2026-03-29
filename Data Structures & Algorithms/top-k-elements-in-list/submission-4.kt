class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val store = mutableMapOf<Int, Int>()
        for (n in nums) {
            store[n] = (store[n] ?: 0) + 1
        }

        val tmp = List(nums.size + 1) { mutableListOf<Int>() }
        
        for ((n, count) in store) {
            tmp[count].add(n)
        }
        
        val result = mutableListOf<Int>()
        for (i in tmp.size - 1 downTo 1) {
            for (n in tmp[i]) {
                result.add(n)
                if (result.size == k) {
                    return result.toIntArray()
                }
            }
        }
        return result.toIntArray()
    }
}
