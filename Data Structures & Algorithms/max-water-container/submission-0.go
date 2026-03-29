func maxArea(heights []int) int {
    max := 0
    for i := range heights {
        j := i + 1
        for j < len(heights) {
            l := j - i
            h := heights[i]
            if h > heights[j] {
                h = heights[j]
            }
            s := h * l
            if s > max {
                max = s
            }
            j++
        }
    }
    return max
}
