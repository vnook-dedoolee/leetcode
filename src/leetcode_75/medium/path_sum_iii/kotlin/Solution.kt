// https://leetcode.com/problems/path-sum-iii/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.path_sum_iii.kotlin

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun pathSum(root: TreeNode?, targetSum: Int): Int {
        if (root == null) return 0
        return cnt(root, targetSum.toLong()) +
                pathSum(root.left, targetSum) +
                pathSum(root.right, targetSum)
    }

    private fun cnt(node: TreeNode?, targetSum: Long): Int {
        if (node == null) return 0
        var result = 0
        val diff = targetSum - node.`val`
        if (diff == 0L) result++
        result += cnt(node.left, diff)
        result += cnt(node.right, diff)
        return result
    }
}