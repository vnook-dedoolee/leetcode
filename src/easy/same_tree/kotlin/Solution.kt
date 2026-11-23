// https://leetcode.com/problems/same-tree/description/

package easy.same_tree.kotlin

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) return true
        if (p == null || q == null) return false
        return p.`val` == q.`val`
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right)
    }
}
