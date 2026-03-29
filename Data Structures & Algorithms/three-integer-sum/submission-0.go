import "slices"

func threeSum(nums []int) [][]int {
    slices.Sort(nums)
    var result [][]int
    for i, a := range nums {
        if a > 0 {
            break
        }
        if i > 0 && nums[i-1] == a {
            continue
        }
        l := i + 1
        r := len(nums) - 1

        for l < r {
            s := a + nums[l] + nums[r]
            if s > 0 {
                r--
            } else if s < 0 {
                l++
            } else {
                result = append(result, []int{a, nums[l], nums[r]})
                l++
                r--
                for nums[l] == nums[l-1] && l < r { l++ }
            }
        }
    }
    return result
}
