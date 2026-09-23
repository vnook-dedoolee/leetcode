package leetcode_75.easy.reverse_vowels_of_a_string.kotlin

class Solution {
    fun reverseVowels(s: String): String {
        val vowels = s.filter { it in "aeiouAEIOU" }.reversed()
        var idx = 0
        return s.map { ch ->
            if (ch in "aeiouAEIOU") vowels[idx++] else ch
        }.joinToString("")
    }
}
