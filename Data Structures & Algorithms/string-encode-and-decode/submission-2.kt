class Solution {

    private val separator = "#"

    fun encode(strs: List<String>): String {
        return buildString {
            val lengths = strs.map { it.length }

            for (i in strs.indices) {
                append(lengths[i])
                append("#")
                append(strs[i])
            }
        }
    }

    fun decode(str: String): List<String> {
        var start = 0
        val result = mutableListOf<String>()
        
        var length = 0
        while (start in str.indices) {
            while(str[start].isDigit()) {
                length = (length * 10) + str[start].digitToInt()
                start++
            }
            if (str[start] != '#') throw IllegalStateException("Must be dash")
            
            start++

            if (length == 0) {
                length = 0
                result.add("")
                continue
            }
            start += length
            result.add(str.substring(start - length, start))
            length = 0
        }

        return result
    }
}
