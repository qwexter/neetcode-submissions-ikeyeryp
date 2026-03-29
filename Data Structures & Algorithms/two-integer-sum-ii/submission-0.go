func twoSum(numbers []int, target int) []int {
    l := 0
    r := len(numbers) - 1
    for l < r {
        c := numbers[l] + numbers[r]
        if c == target {
            break
        }
        if c > target {
            r--
        } else {
            l++
        }
    }
    return []int{l+1,r+1}
}
