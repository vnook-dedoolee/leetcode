// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.longest_subarray_of_1s_after_aeleting_one_element.kotlin

class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var left = 0
        var zeroCount = 0
        var maxOnes = 0

        for (right in nums.indices) {
            if (nums[right] == 0) zeroCount++

            while (zeroCount > 1) {
                if (nums[left] == 0) zeroCount--
                left++
            }

            maxOnes = maxOf(maxOnes, right - left)
        }

        return maxOnes
    }
}

fun main() {
    Solution().longestSubarray(intArrayOf(0, 1, 1, 1, 0, 1, 1, 0, 1))
}