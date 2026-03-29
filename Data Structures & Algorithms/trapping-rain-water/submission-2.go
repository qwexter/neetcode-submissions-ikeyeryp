func trap(height []int) int {
    l := len(height)
    maxLeft := make([]int, l)
    maxRight := make([]int, l)
    for h := range height {
        t := l - h - 1
        if h == 0 {
            maxLeft[h] = height[h]
            maxRight[t] = height[t]
            continue
        }
        if height[h] > maxLeft[h - 1] {
            maxLeft[h] = height[h]
        } else {
            maxLeft[h] = maxLeft[h - 1]
        }
        if height[t] > maxRight[t + 1] {
            maxRight[t] = height[t]
        } else {
            maxRight[t] = maxRight[t + 1]
        }
    }
    max := 0
    for  h := range height {
        min := 0
        if maxLeft[h] < maxRight[h] {
            min = maxLeft[h]
        } else {
            min = maxRight[h]
        }
        diff := min - height[h]
        if diff > 0 {
            max += diff
        }
    }
    return max
}