// https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.easy.find_pivot_index.kotlin

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        if (makeSubArr(nums, 1, nums.size).sum() == 0) return 0
        for (i in 0 until nums.size) {
            val subArrLeft = makeSubArr(nums, 0, i)
            val subArrRight = makeSubArr(nums, i + 1, nums.size)
            val sumLeft = subArrLeft.sum()
            val sumRight = subArrRight.sum()
            if (sumLeft == sumRight) return i
        }
        return -1
    }

    private fun makeSubArr(mainArr: IntArray, from: Int, to: Int): IntArray {
        return mainArr.copyOfRange(from, to)
    }
}
