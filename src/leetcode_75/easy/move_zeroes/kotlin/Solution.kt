// https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.easy.move_zeroes.kotlin

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var pos = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[pos] = nums[i]
                pos++
            }
        }
        for (i in pos until nums.size) {
            nums[i] = 0
        }
    }
}