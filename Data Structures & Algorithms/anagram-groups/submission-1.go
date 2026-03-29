import (
    "slices"
)

func groupAnagrams(strs []string) [][]string {
    c := make(map[string][]string)

    for _, s := range strs {
        t := []byte(s)
        slices.Sort(t)
        key := string(t)
        c[key] = append(c[key], s)
    }

    var r [][]string
    for _, v := range c {
        r = append(r, v)
    }

    return r
}
