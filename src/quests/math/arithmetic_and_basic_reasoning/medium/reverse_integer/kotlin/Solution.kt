// https://leetcode.com/quest/maths-quest/quiz/reverse-integer/?envType=problem-list-v2&envId=maths-m1-assignment

package quests.math.arithmetic_and_basic_reasoning.medium.reverse_integer.kotlin

class Solution {
    fun reverse(x: Int): Int {
        var n = x
        var res = 0
        while (n != 0) {
            val digit = n % 10
            n /= 10
            if (res > Int.MAX_VALUE / 10 || (res == Int.MAX_VALUE / 10 && digit > 7)) return 0
            if (res < Int.MIN_VALUE / 10 || (res == Int.MIN_VALUE / 10 && digit < -8)) return 0
            res = res * 10 + digit
        }
        return res
    }
}
