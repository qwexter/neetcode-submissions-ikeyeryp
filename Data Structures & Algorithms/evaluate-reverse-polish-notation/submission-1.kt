class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()
        val lookup = setOf<String>("-", "+", "*", "/")
        for (t in tokens) {
            if (t !in lookup) {
                stack.push(t.toInt())
                continue
            }
            val b = stack.pop()
            val a = stack.pop()
            val result = when(t) {
                "+" -> a + b
                "-" -> a - b
                "*" -> a * b
                else -> a / b
            }
            stack.push(result)
        }
        return stack.peek()
    }
}
