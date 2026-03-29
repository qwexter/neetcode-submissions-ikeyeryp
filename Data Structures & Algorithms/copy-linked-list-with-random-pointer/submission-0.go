/**
 * Definition for a Node.
 * type Node struct {
 *     Val int
 *     Next *Node
 *     Random *Node
 * }
 */

func copyRandomList(head *Node) *Node {
    store := make(map[*Node]*Node)
    store[nil] = nil
    c := head
    for c != nil {

        store[c] = &Node{ Val: c.Val,}

        c = c.Next
    }
    c = head
    
    for c != nil {
        cp := store[c]
        cp.Next = store[c.Next]
        cp.Random = store[c.Random]
        
        c = c.Next
    }

    return store[head]
}
