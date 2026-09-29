// https://leetcode.com/problems/max-number-of-k-sum-pairs/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.max_number_of_k_sum_pairs.kotlin

class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        val count = HashMap<Int, Int>()
        var result = 0
        for (n in nums) {
            val need = k - n
            val c = count.getOrDefault(need, 0)
            if (c > 0) {
                result++
                count[need] = c - 1
            } else {
                count[n] = count.getOrDefault(n, 0) + 1
            }
        }
        return result
    }
}
