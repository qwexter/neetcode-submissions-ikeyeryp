class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val result = IntArray(temperatures.size)
        val stack = mutableListOf<Int>()
        for (i in temperatures.indices) {
            while(stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]) {
                val savedIndex = stack.removeLast()
                result[savedIndex] = i - savedIndex
            }
            stack.add(i)
        }
        return result
    }
}
