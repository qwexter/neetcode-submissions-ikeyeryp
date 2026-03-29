class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val store = IntArray(26)
        for (i in s.indices) {
            store[s[i] - 'a'] += 1
            store[t[i] - 'a'] -= 1 
        }
        return store.all { it == 0 }
    }
}
