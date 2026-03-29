func searchMatrix(matrix [][]int, target int) bool {
    rows, cols := len(matrix), len(matrix[0])
    l := 0
    r := rows * cols - 1

    for l <= r {
        m := l + (r - l) / 2
        row := m / cols
        col := m % cols
        
        if matrix[row][col] == target {
            return true
        } else if matrix[row][col] < target {
            l = m + 1
        } else {
            r = m - 1
        }
    }
    return false
}
