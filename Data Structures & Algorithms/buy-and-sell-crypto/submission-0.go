func maxProfit(prices []int) int {
    l := prices[0]
    max := 0
    for i := 1; i < len(prices); i++ {
        if prices[i] < l {
            l = prices[i]
            continue
        }
        d := prices[i] - l
        if d > max {
            max = d
        }
    }
    
    return max
}
