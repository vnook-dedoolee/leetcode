// https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.product_of_array_except_self.kotlin

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val res = IntArray(n)

        var prefix = 1
        for (i in 0 until n) {
            res[i] = prefix
            prefix *= nums[i]
        }

        var suffix = 1
        for (i in n - 1 downTo 0) {
            res[i] *= suffix
            suffix *= nums[i]
        }

        return res
    }
}