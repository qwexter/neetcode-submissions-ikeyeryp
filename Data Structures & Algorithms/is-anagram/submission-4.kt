class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val store = IntArray(26)

        for (i in 0 until s.length) {
            store[s[i] - 'a']++
            store[t[i] - 'a']--
        }

        return store.none { v -> v != 0}
    }
}
