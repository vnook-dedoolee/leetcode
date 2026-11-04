// https://leetcode.com/problems/binary-tree-right-side-view/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.binary_tree_right_side_view.kotlin

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        if (root == null) return result

        val queue: ArrayDeque<TreeNode> = ArrayDeque()
        queue.addLast(root)

        while (queue.isNotEmpty()) {
            val levelSize = queue.size

            repeat(levelSize) { i ->
                val node = queue.removeFirst()

                if (i == levelSize - 1) result.add(node.`val`)

                node.left?.let  { queue.addLast(it) }
                node.right?.let { queue.addLast(it) }
            }
        }
        return result
    }
}