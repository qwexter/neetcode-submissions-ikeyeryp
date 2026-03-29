func characterReplacement(s string, k int) int {
    counts := make(map[byte]int)
    var l, r, maxLength, maxFrequency = 0, 0, 0, 0
    for r < len(s) {
        counts[s[r]] += 1
        if maxFrequency < counts[s[r]] {
            maxFrequency = counts[s[r]]
        }
        for (r - l + 1) - maxFrequency > k {
            counts[s[l]] -= 1
            l++
        }
        curLenght := (r - l + 1)
        if maxLength < curLenght {
            maxLength = curLenght
        }
        r++
    }
    return maxLength
}
