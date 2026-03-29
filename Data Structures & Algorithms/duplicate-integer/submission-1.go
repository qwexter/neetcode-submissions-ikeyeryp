type Set struct{
    elements map[int]struct{}
}

func (s *Set) Add (v int) bool {
    _, found := s.elements[v];
    if  found {
        return true 
    }
    s.elements[v] = struct{}{}
    return false
}  

func hasDuplicate(nums []int) bool {
    s := &Set {
        elements: make(map[int]struct{}),
    }
    for _, v := range nums {
        if s.Add(v) {
            return true
        }
    }
    return false
}
