// https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.increasing_triplet_subsequence.kotlin

class Solution {
    fun increasingTriplet(nums: IntArray): Boolean {
        var first = Int.MAX_VALUE
        var second = Int.MAX_VALUE

        for (num in nums) {
            when {
                num <= first -> first = num
                num <= second -> second = num
                else -> return true
            }
        }
        return false
    }
}