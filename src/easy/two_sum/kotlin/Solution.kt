// https://leetcode.com/problems/two-sum/description/

package leetcode_75.easy.two_sum.kotlin

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        var n = 0
        var m = 0
        while (n < nums.size) {
            if ((nums[n] + nums[m] == target) && n != m) {
                result[0] = n
                result[1] = m
            }
            m++
            if (m >= nums.size) {
                n++
                m = 0
            }
        }

        return result
    }
}
