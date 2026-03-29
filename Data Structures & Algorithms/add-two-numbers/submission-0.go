/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    dummy := &ListNode{}
    head := dummy
    carry := 0
    for l1 != nil && l2 != nil {
        sum := l1.Val + l2.Val + carry
        head.Next = &ListNode{Val:(sum % 10)}
        carry = sum / 10
        l1 = l1.Next
        l2 = l2.Next
        head = head.Next
    }

    var tmp *ListNode = nil
    if l1 != nil {
        tmp = l1
    } else if l2 != nil {
        tmp = l2
    }

    for tmp != nil {
        sum := tmp.Val + carry
        head.Next = &ListNode{Val:(sum % 10)}
        carry = sum / 10
        tmp = tmp.Next
        head = head.Next
    }

    if carry > 0 {
        head.Next = &ListNode{Val:(carry)}
    }

    return dummy.Next
}
