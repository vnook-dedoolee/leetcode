// https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.reverse_words_in_a_string.kotlin

class Solution {
    fun reverseWords(s: String): String {
        return s.split("\\s+".toRegex()).reversed().joinToString(" ").trim()
    }
}