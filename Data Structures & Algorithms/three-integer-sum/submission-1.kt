class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableSetOf<List<Int>>()
        nums.sort()
        // [-4,-1,-1,0,1,2]
        for (i in nums.indices) { // i = 1
            val b = nums[i] // -1
            if (b > 0) break

 

            var l = i+1 // 4
            var r = nums.size - 1 // 5

            while (l < r) { // true
                val sum = b + nums[l] + nums[r] // -4 + 1 + 2 == -1
                when {
                    sum > 0 -> r--
                    sum < 0 -> l++
                    else -> {
                        result.add(listOf(b, nums[l], nums[r]))
                        l++; r--
                        while(l < r && nums[l] == nums[l-1]) { l++ }
                    }
                }
            }
        }
        return result.toList()
    }
}
