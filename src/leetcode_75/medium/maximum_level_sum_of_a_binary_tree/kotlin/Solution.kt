// https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.maximum_level_sum_of_a_binary_tree.kotlin

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun maxLevelSum(root: TreeNode?): Int {
        if (root == null) return 0

        val queue = ArrayDeque<TreeNode>()
        queue.addLast(root)

        var maxSum = Int.MIN_VALUE
        var maxLevel = 1
        var currentLevel = 1

        while (queue.isNotEmpty()) {
            val levelSize = queue.size
            var levelSum = 0

            repeat(levelSize) {
                val node = queue.removeFirst()
                levelSum += node.`val`
                node.left?.let  { queue.addLast(it) }
                node.right?.let { queue.addLast(it) }
            }

            if (levelSum > maxSum) {
                maxSum = levelSum
                maxLevel = currentLevel
            }
            currentLevel++
        }
        return maxLevel
    }
}