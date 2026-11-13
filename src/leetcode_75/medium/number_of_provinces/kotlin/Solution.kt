// https://leetcode.com/problems/number-of-provinces/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.number_of_provinces.kotlin

class Solution {
    fun findCircleNum(isConnected: Array<IntArray>): Int {
        val n = isConnected.size
        val visited = BooleanArray(n)
        var provinces = 0

        fun dfs(city: Int) {
            visited[city] = true
            for (next in 0 until n) {
                if (isConnected[city][next] == 1 && !visited[next]) {
                    dfs(next)
                }
            }
        }

        for (city in 0 until n) {
            if (!visited[city]) {
                provinces++
                dfs(city)
            }
        }
        return provinces
    }
}