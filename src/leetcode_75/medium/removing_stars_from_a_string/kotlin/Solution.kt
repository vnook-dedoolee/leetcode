// https://leetcode.com/problems/removing-stars-from-a-string/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.removing_stars_from_a_string.kotlin

class Solution {
    fun removeStars(s: String): String {
        val stack = StringBuilder()
        for (c in s) {
            if (c == '*') {
                if (stack.isNotEmpty()) {
                    stack.deleteCharAt(stack.length - 1)
                }
            } else {
                stack.append(c)
            }
        }
        return stack.toString()
    }
}