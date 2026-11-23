// https://leetcode.com/problems/symmetric-tree/description/

package easy.symmetric_tree.kotlin

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return false

        fun isMirror(left: TreeNode?, right: TreeNode?): Boolean {
            if (left == null && right == null) return true
            if (left == null || right == null) return false
            return left.`val` == right.`val`
                    && isMirror(left.left, right.right)
                    && isMirror(left.right, right.left)
        }

        return isMirror(root.left, root.right)
    }
}
