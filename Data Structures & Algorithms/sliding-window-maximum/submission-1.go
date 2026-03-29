func maxSlidingWindow(nums []int, k int) []int {
    result := []int{}
    n:= len(nums)
    for i := 0; i <= n - k; i++ {
         max := math.MinInt32
        for j := i; j < i + k; j++ {
            if nums[j] > max {
                max = nums[j]
            }
        }
        result = append(result, max)
    }

    return result
}
