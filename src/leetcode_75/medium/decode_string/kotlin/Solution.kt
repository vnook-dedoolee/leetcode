// https://leetcode.com/problems/decode-string/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.decode_string.kotlin

import java.lang.StringBuilder

class Solution {
    fun decodeString(s: String): String {
        val counts = ArrayDeque<Int>()
        val prefixes = ArrayDeque<StringBuilder>()

        var repeatCount = 0
        var current = StringBuilder()

        for (ch in s) {
            when {
                ch.isDigit() -> repeatCount = repeatCount * 10 + (ch - '0')

                ch == '[' -> {
                    counts.addLast(repeatCount)
                    prefixes.addLast(current)
                    repeatCount = 0
                    current = StringBuilder()
                }

                ch == ']' -> {
                    val times = counts.removeLast()
                    val prefix = prefixes.removeLast()
                    prefix.append(current.repeat(times))
                    current = prefix
                }

                else -> current.append(ch)
            }
        }

        return current.toString()
    }
}

fun main() {
    Solution().decodeString("3[a]2[bc]") // "aaabcbc"
    Solution().decodeString("3[a2[c]]") // "accaccacc"
    Solution().decodeString("2[abc]3[cd]ef") // "abcabccdcdcdef"
}