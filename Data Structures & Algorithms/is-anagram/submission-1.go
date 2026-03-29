func isAnagram(s string, t string) bool {
    if len(s) != len(t) {
        return false
    }

    c := make(map[byte]int)

    for i := range len(s) {
        c[s[i]] += 1
        c[t[i]] -= 1
    }

    for _,v := range c {
        if (v != 0) {
            return false
        }
    }
    return true
}
