// https://leetcode.com/problems/binary-tree-inorder-traversal/description/

package easy.binary_tree_inorder_traversal.kotlin

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()

        fun dfs(node: TreeNode?) {
            if (node == null) return
            dfs(node.left)
            result.add(node.`val`)
            dfs(node.right)
        }

        dfs(root)

        return result
    }
}
