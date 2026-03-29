func lengthOfLongestSubstring(s string) int {
    seen := make(map[byte]int)
    max, start := 0, 0

    for i := 0; i < len(s); i++ {
        if lastSeen, ok := seen[s[i]]; ok && lastSeen >= start {
            start = lastSeen + 1
        }
        seen[s[i]] = i
        diff := i - start + 1
        if  diff > max {
            max = diff
        } 
    }

    return max
}