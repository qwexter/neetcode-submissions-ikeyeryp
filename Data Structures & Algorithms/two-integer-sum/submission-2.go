func twoSum(nums []int, target int) []int {

    var i = 0
    var j = 0
    
    for i < len(nums) {
        j = i + 1
        for j < len(nums) {
            if (nums[i] + nums[j]) == target {
                return []int{i, j}
            }
            j += 1
        }
        i += 1
    }

    return []int{i, j}
}
