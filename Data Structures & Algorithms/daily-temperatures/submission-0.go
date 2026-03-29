func dailyTemperatures(temperatures []int) []int {
    results := make([]int, len(temperatures))
    for i := range temperatures {
        for j := i + 1; j < len(temperatures); j++ {
            if temperatures[i] < temperatures[j] {
                results[i] = j - i
                break
            }
        }
    }
    return results
}
