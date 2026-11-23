// https://leetcode.com/problems/evaluate-division/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.evaluate_division.kotlin

class Solution {
    fun calcEquation(equations: List<List<String>>, values: DoubleArray, queries: List<List<String>>): DoubleArray {
        val graph = HashMap<String, MutableList<Pair<String, Double>>>()

        for ((i, eq) in equations.withIndex()) {
            val (a, b) = eq
            graph.getOrPut(a) { mutableListOf() }.add(b to values[i])
            graph.getOrPut(b) { mutableListOf() }.add(a to 1.0 / values[i])
        }

        return DoubleArray(queries.size) { i ->
            val (from, to) = queries[i]
            if (from !in graph || to !in graph) return@DoubleArray -1.0
            if (from == to) return@DoubleArray 1.0

            val visited = HashSet<String>()
            var result = -1.0

            fun dfs(node: String, acc: Double): Boolean {
                if (node == to) {
                    result = acc
                    return true
                }
                visited.add(node)
                for ((next, weight) in graph[node]!!) {
                    if (next in visited) continue
                    if (dfs(next, acc * weight)) return true
                }
                return false
            }

            dfs(from, 1.0)
            result
        }
    }
}
