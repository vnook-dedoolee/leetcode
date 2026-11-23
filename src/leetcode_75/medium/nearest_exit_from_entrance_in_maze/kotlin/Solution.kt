// https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.nearest_exit_from_entrance_in_maze.kotlin

class Solution {
    fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {
        val m = maze.size
        val n = maze[0].size
        val dirs = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

        val visited = Array(m) { BooleanArray(n) }
        val queue = ArrayDeque<Triple<Int, Int, Int>>()

        queue.addLast(Triple(entrance[0], entrance[1], 0))
        visited[entrance[0]][entrance[1]] = true

        while (queue.isNotEmpty()) {
            val (r, c, steps) = queue.removeFirst()

            for ((dr, dc) in dirs) {
                val nr = r + dr
                val nc = c + dc

                if (nr !in 0 until m || nc !in 0 until n) continue
                if (visited[nr][nc]) continue
                if (maze[nr][nc] == '+') continue

                if (nr == 0 || nr == m - 1 || nc == 0 || nc == n - 1) {
                    return steps + 1
                }

                visited[nr][nc] = true
                queue.addLast(Triple(nr, nc, steps + 1))
            }
        }
        return -1
    }
}

fun main() {
    val maze = arrayOf(charArrayOf('+', '+', '.', '+'), charArrayOf('.', '.', '.', '+'), charArrayOf('+', '+', '+', '.'))
    val entrance = intArrayOf(1, 2)
    Solution().nearestExit(maze, entrance)
}