// https://leetcode.com/problems/equal-row-and-column-pairs/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.equal_row_and_column_pairs.kotlin

class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        var result = 0
        for (i in 0 until grid.size) {
            val colToRaw = fillRaw(i, grid)
            for (j in 0 until grid[i].size) {
                if (colToRaw.contentEquals(grid[j])) result++
            }
        }
        return result
    }

    private fun fillRaw(idx: Int, matrix: Array<IntArray>): IntArray {
        val raw = mutableListOf<Int>()
        matrix.forEach { f -> raw.add(f[idx]) }
        return raw.toIntArray()
    }
}