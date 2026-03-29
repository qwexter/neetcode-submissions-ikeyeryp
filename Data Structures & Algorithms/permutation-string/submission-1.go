func checkInclusion(s1 string, s2 string) bool {
    if len(s1) > len(s2) {
        return false
    }
    counts := [26]int{}
    requiredMatched := 0
    matchingChar := 0
    
    for _, v := range s1 {
        counts[v - 'a'] += 1
        if counts[v - 'a'] == 1 {
            requiredMatched +=1
        }
    }
    window := [26]int{}
    windowLength := len(s1)
    l := 0

    for r, v := range s2 {
        charIndex := v - 'a'

        if window[charIndex] == counts[charIndex] {
            matchingChar -=1
        } 
        window[charIndex] += 1

        if window[charIndex] == counts[charIndex] {
            matchingChar +=1
        }

        if r - l + 1 == windowLength {
            if requiredMatched == matchingChar {
                return true
            }
            leftIndex := s2[l] - 'a'
            if window[leftIndex] == counts[leftIndex] {
                matchingChar -=1
            } else if window[leftIndex] == counts[leftIndex] + 1{
                matchingChar +=1
            }
            window[leftIndex] -= 1
            l+=1
        }
    }
    return false
}
