class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = mutableListOf<Int>()
        val lookup = mutableMapOf<String, (Int, Int) -> Int>(
            "+" to { a, b -> a + b },
            "-" to { a, b -> a - b },
            "*" to { a, b -> a * b },
            "/" to { a, b -> a / b },
        )
        for (t in tokens) {
            if (t !in lookup) {
                stack.add(t.toInt())
                continue
            }
            val op = lookup[t]!!
            val b = stack.last()
            stack.removeLast()
            val a = stack.last()
            stack.removeLast()
            stack.add(op(a,b))
        }
        return stack.last()
    }
}
