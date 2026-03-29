func minEatingSpeed(piles []int, h int) int {

    maxPile := 0
    for _, p := range piles {
        if maxPile < p {
            maxPile = p
        }
    }

    l := 1
    r := maxPile

    min := maxPile

    for l <= r {
        m := (r + l) / 2
        sum := 0
        for _, p := range piles {
            sum += int(math.Ceil(float64(p) / float64(m)))
        }
        if sum <= h {
            min = m
            r = m - 1
        } else {
            l = m + 1
        }
    }

    return min
}
