// https://leetcode.com/problems/count-good-nodes-in-binary-tree/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.count_good_nodes_in_binary_tree.kotlin

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun goodNodes(root: TreeNode?): Int {
        return countGoodNodes(root, Int.MIN_VALUE)
    }

    private fun countGoodNodes(node: TreeNode?, maxSoFar: Int): Int {
        if (node == null) return 0

        val currentValue = node.`val`
        val isGood = currentValue >= maxSoFar
        val newMax = Math.max(maxSoFar, currentValue)

        val leftCount = countGoodNodes(node.left, newMax)
        val rightCount = countGoodNodes(node.right, newMax)

        return if (isGood) 1 + leftCount + rightCount else leftCount + rightCount
    }
}