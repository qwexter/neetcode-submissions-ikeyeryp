func isPalindrome(s string) bool {
    buf := []rune(s)
    l := 0
    r := len(buf) - 1
    for r >= l {
        if !isAlphanumeric(buf[r]) {
            r--
            continue
        }
        if !isAlphanumeric(buf[l]) {
            l++
            continue 
        }
        if toLower(buf[r]) != toLower(buf[l]) {
            return false
        }
        r--
        l++
    }
    return true
}

func toLower(r rune) rune {
    if (r >= 'A' && r <= 'Z') {
        return r + ('a' - 'A')       
    }
    return r
}

func isAlphanumeric(c rune) bool {
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'z') || (c >= '0' && c <= '9')
}