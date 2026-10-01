// https://leetcode.com/problems/max-consecutive-ones-iii/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.max_consecutive_ones_iii.kotlin

import kotlin.math.max

class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var maxNumsOfCons = 0
        var left = 0
        var right = 0
        var swipes = 0
        while (right < nums.size) {
            if (nums[right] == 0) swipes++
            right++
            while (swipes > k) {
                if (nums[left] == 0) swipes--
                left++
            }
            maxNumsOfCons = maxOf(maxNumsOfCons, right - left)
        }
        return maxNumsOfCons
    }
}