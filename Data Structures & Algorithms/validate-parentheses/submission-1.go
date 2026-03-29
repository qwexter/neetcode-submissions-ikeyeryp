func isValid(s string) bool {
    pairs := map[byte]byte {
        '[':']',
        '(':')',
        '{':'}',
        ']':'[',
        ')':'(',
        '}':'{',
    }
    var stack []byte
    for i := 0; i < len(s); i++ {
        if isOpening(s[i]) {
            stack = append(stack, s[i])
        } else if len(stack) > 0 && pairs[s[i]] == stack[len(stack) - 1] {
            stack = stack[:len(stack) - 1]
        } else {
            return false
        }
    }
    return len(stack) == 0
}

func isOpening(c byte) bool {
    if c == '(' || c == '[' || c == '{' {
        return true
    }
    return false
}