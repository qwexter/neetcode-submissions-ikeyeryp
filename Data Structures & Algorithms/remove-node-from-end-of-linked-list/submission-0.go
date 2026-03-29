/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

func removeNthFromEnd(head *ListNode, n int) *ListNode {
    start := &ListNode{
        Next: head,
    }
    left := start
    right := head

    for n > 0 {
        right = right.Next
        n--
    }
    for right != nil {
        right = right.Next
        left = left.Next
    }
    left.Next = left.Next.Next
    return start.Next
}
