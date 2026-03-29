func isValidSudoku(board [][]byte) bool {
	var rows [9]int
	var columns [9]int
	var boxes [9]int

	for r := range 9 {
		for c := range 9 {
			s := board[r][c]
			if s == '.' {
				continue
			}
            boxN := (r / 3) * 3 + (c / 3)
			mask := 1 << (s - '1')
			if ((rows[r] & mask) != 0) || ((columns[c] & mask) != 0) || ((boxes[boxN] & mask) != 0) {
				return false
			}
			rows[r] |= mask
			columns[c] = columns[c] | mask
            boxes[boxN] |= mask
		}
	}
	return true
}
