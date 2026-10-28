// https://leetcode.com/problems/leaf-similar-trees/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.easy.leaf_similar_trees.kotlin

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val output1 = mutableListOf<Int>()
        val output2 = mutableListOf<Int>()

        dfs(root1, output1)
        dfs(root2, output2)

        return output1 == output2
    }

    fun dfs(node: TreeNode?, output: MutableList<Int>) {
        if (node == null) return
        if (node.left == null && node.right == null) {
            output.add(node.`val`)
            return
        }
        dfs(node.left, output)
        dfs(node.right, output)
    }
}