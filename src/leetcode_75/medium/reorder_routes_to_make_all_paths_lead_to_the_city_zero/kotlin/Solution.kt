// https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.reorder_routes_to_make_all_paths_lead_to_the_city_zero.kotlin

class Solution {
    fun minReorder(n: Int, connections: Array<IntArray>): Int {
        var result = 0
        val G = Array(n) { mutableListOf<Pair<Int, Int>>() }
        for ((a, b) in connections) {
            G[a].add(b to 1)
            G[b].add(a to 0)
        }

        val visited = BooleanArray(n)

        fun dfs(u: Int) {
            visited[u] = true
            for ((v, cost) in G[u]) {
                if (!visited[v]) {
                    result += cost
                    dfs(v)
                }
            }
        }

        dfs(0)

        return result
    }
}