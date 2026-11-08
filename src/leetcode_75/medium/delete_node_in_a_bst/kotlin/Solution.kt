// https://leetcode.com/problems/delete-node-in-a-bst/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.delete_node_in_a_bst.kotlin


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        if (root == null) return null
        if (root.`val` == key) return deleteRoot(root)
        dfs(root, key)
        return root
    }

    private fun dfs(parent: TreeNode?, key: Int) {
        if (parent == null) return

        val l = parent.left
        if (l != null) {
            if (l.`val` == key) { parent.left = deleteRoot(l); return }
            dfs(l, key)
        }

        val r = parent.right
        if (r != null) {
            if (r.`val` == key) { parent.right = deleteRoot(r); return }
            dfs(r, key)
        }
    }

    private fun deleteRoot(node: TreeNode): TreeNode? {
        if (node.left == null) return node.right
        if (node.right == null) return node.left
        var min = node.right!!
        while (min.left != null) min = min.left!!
        node.`val` = min.`val`
        node.right = deleteMin(node.right!!)
        return node
    }

    private fun deleteMin(node: TreeNode): TreeNode? {
        if (node.left == null) return node.right
        node.left = deleteMin(node.left!!)
        return node
    }
}