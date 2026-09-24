package leetcode_75.easy.reverse_words_in_a_string.kotlin

class Solution {
    fun reverseWords(s: String): String {
        return s.split("\\s+".toRegex()).reversed().joinToString(" ").trim()
    }
}