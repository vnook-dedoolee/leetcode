package leetcode_75.easy.merge_strings_alternately.kotlin

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val totalLength = word1.length + word2.length
        val result = StringBuilder()
        for (i in 0 until totalLength) {
            if (i < word1.length) {
                result.append(word1[i])
            }
            if (i < word2.length) {
                result.append(word2[i])
            }
        }
        return result.toString()
    }
}
