/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

func hasCycle(head *ListNode) bool {
    store := make(map[*ListNode]bool)
    tail := head
    for tail != nil {
        if store[tail] {
            return true
        }
        store[tail] = true
        tail = tail.Next
    }
    return false
}
