func twoSum(nums []int, target int) []int {

    c := make(map[int]int)

    c[target - nums[0]] = 0

    for i:=1; i < len(nums); i++ {
        if f, found := c[nums[i]]; found {
            return []int{f, i}
        }
        c[target-nums[i]] = i
    }
    return []int{0, 1}
}
