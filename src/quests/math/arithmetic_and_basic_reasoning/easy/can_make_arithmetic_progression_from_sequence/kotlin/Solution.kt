// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/?envType=problem-list-v2&envId=maths-m1-arithmetic-basic-reasoning

package quests.math.arithmetic_and_basic_reasoning.easy.can_make_arithmetic_progression_from_sequence.kotlin

import kotlin.math.abs

class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        if (arr.size <= 1) return false
        val sorted = arr.sorted()
        val compare = abs(sorted[0] - sorted[1])
        for (i in 1 until sorted.size) {
            if (abs(sorted[i] - sorted[i - 1]) != compare) return false
        }
        return true
    }
}
