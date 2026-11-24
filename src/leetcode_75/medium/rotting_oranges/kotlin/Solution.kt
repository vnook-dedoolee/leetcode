// https://leetcode.com/problems/rotting-oranges/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.rotting_oranges.kotlin

class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        val queue = ArrayDeque<IntArray>()
        var fresh = 0

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                when (grid[r][c]) {
                    2 -> queue.addLast(intArrayOf(r, c))
                    1 -> fresh++
                }
            }
        }

        if (fresh == 0) return 0

        var minutes = 0
        val dirs = arrayOf(intArrayOf(-1, 0), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(0, 1))

        while (queue.isNotEmpty()) {
            var size = queue.size
            var rottedThisRound = false
            while (size-- > 0) {
                val (r, c) = queue.removeFirst()
                for (d in dirs) {
                    val nr = r + d[0]
                    val nc = c + d[1]
                    if (nr in 0 until rows && nc in 0 until cols && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2
                        fresh--
                        queue.addLast(intArrayOf(nr, nc))
                        rottedThisRound = true
                    }
                }
            }
            if (rottedThisRound) minutes++
        }

        return if (fresh == 0) minutes else -1
    }
}
