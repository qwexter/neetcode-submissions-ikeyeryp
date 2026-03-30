class Solution {
    fun isPalindrome(s: String): Boolean {
        var r = s.length - 1
        var l = 0

        // "tab a cat"
        // l = 2; r = 6
        // s[l] = b s[r] = c
        while (l < r) {
            while (l < r && !s[r].isLetterOrDigit()) { r-- }
            while (l < r && !s[l].isLetterOrDigit()) { l++ }
            
            if (!(s[l].equals(s[r], ignoreCase =true))) {
                return false
            }

            r--
            l++
        }

        return true
    }
}
