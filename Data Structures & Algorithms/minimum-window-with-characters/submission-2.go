func minWindow(s string, t string) string {
      minLength := len(s) + 1
    minString := ""
    counts := make(map[byte]int)
    requiredMatches := 0
    for i, _ := range t {
        v := t[i] 
        counts[v] += 1
        if counts[v] == 1 {
            requiredMatches += 1
        }
    }
    l := 0
    window := make(map[byte]int)
    currentMatches := 0
    for r, _ := range s {
        v := s[r]
        window[v] += 1
        if counts[v] > 0 && window[v] == counts[v] {
            currentMatches += 1
        }
        for currentMatches == requiredMatches {
            windowSize := r - l + 1
            if windowSize < minLength {
                minLength = windowSize
                minString = s[l:r + 1]
            }
            j := s[l]
            window[j] -= 1
            if counts[j] > 0 && window[j] < counts[j] {
                currentMatches -= 1
            }
            l++
        }


    }
    return minString
}
