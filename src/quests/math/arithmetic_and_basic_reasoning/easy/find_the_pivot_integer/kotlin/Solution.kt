// https://leetcode.com/problems/find-the-pivot-integer/description/?envType=problem-list-v2&envId=maths-m1-arithmetic-basic-reasoning

package quests.math.arithmetic_and_basic_reasoning.easy.find_the_pivot_integer.kotlin

import kotlin.math.sqrt

class Solution {
    fun pivotInteger(n: Int): Int {
        val total = n * (n + 1) / 2
        val x = sqrt(total.toDouble()).toInt()
        return if (x * x == total) x else -1
    }
}
