func longestConsecutive(nums []int) int {
    fakeSet := make(map[int]bool)
    for _, n := range nums {
        fakeSet[n] = true
    }

    max := 0

    for _, n := range nums {
        if (fakeSet[n-1]) {
            continue
        }
        
        i := 1
        for (fakeSet[n+i]) {
            i += 1
        }
        if (max < i) {
            max = i
        }
    }
    return max
}
