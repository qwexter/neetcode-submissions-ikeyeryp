func dailyTemperatures(temperatures []int) []int {
    results := make([]int, len(temperatures))
    stack := []int{}
    for i, t := range temperatures {
        j := len(stack) - 1
        for len(stack) > 0 && t > temperatures[stack[j]] {
            k := stack[j]
            stack = stack[:j]
            results[k] = i - k
            j = len(stack)-1
        }
        stack = append(stack, i)
    }
    return results
}
