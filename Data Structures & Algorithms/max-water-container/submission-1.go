func maxArea(heights []int) int {
    max := 0
    i := 0
    j := len(heights) - 1
    for (i < j) {
        l := j - i
        h := heights[i]
        if h > heights[j] {
            h = heights[j]
        }
        s := h * l
        if max < s {
            max = s
        }
        if (heights[i] < heights[j]) {
            i++
        } else {
            j--
        }
    }
    return max
}
