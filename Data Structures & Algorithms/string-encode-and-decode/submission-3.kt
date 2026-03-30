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
        
        while (start in str.indices) {
            var length = 0
            while(str[start].isDigit()) {
                length = (length * 10) + str[start].digitToInt()
                start++
            }     
            start++
            result.add(str.substring(start, start + length))
            start += length
        }

        return result
    }
}
