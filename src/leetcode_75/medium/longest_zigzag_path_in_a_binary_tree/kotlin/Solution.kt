// https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.longest_zigzag_path_in_a_binary_tree.kotlin

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {

    private var maxLen = 0

    fun longestZigZag(root: TreeNode?): Int {
        if (root == null) return 0
        dfs(root.left, 1, 1)
        dfs(root.right, 0, 1)

        return maxLen
    }

    private fun dfs(node: TreeNode?, direction: Int, length: Int) {
        if (node == null) return

        if (length > maxLen) maxLen = length

        dfs(node.left, 1, if (direction == 1) 1 else length + 1)
        dfs(node.right, 0, if (direction == 0) 1 else length + 1)
    }
}