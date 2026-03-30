class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        val lookup = mapOf<Char, Char>(
            ')' to '(',
            '}' to '{',
            ']' to '[',
        )

        for (c in s) {
            if (c !in lookup.keys) {
                stack.add(c)
                continue
            }
            if (stack.lastOrNull() != lookup[c]) {
                return false
            } else {
                stack.removeLast()
            }
        }

        return stack.isEmpty()
    }
}
