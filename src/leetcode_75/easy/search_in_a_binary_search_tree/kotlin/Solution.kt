// https://leetcode.com/problems/search-in-a-binary-search-tree/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.easy.search_in_a_binary_search_tree.kotlin

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        return dfs(root, `val`)
    }

    private fun dfs(node: TreeNode?, `val`: Int): TreeNode? {
        if (node == null || node.`val` == `val`) return node
        return dfs(node.left, `val`) ?: dfs(node.right, `val`)
    }
}