// https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.easy.maximum_average_subarray_i.kotlin

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = nums.take(k).sum().toLong()
        var maxSum = sum
        for (i in k until nums.size) {
            sum += nums[i] - nums[i - k]
            maxSum = maxOf(maxSum, sum)
        }
        return maxSum.toDouble() / k
    }
}
