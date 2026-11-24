// https://leetcode.com/problems/palindrome-number/description/?envType=problem-list-v2&envId=maths-m1-arithmetic-basic-reasoning

package quests.math.arithmetic_and_basic_reasoning.easy.palindrome_number.kotlin

class Solution {
    fun isPalindrome(x: Int): Boolean {
        val xStr = x.toString()
        val xStrRev = x.toString().reversed()
        return xStr == xStrRev
    }
}
