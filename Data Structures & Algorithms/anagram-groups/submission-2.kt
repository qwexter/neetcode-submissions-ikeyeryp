class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        // strs[i] is made up of lowercase English letters.
        val store = buildMap<Map<Char, Int>, MutableList<String>>(strs.size) {
            for (str in strs) {
                val key = buildMap<Char, Int>('z' - 'a' + 1) {
                    for (i in str) {
                        this[i] = (this[i] ?: 0) + 1
                    }   
                }
                if (contains(key)) {
                    get(key)?.add(str)
                } else {
                    put(key, mutableListOf(str))
                }
            }
        }
        return store.values.map {it.toList()}.toList()
    }
}
