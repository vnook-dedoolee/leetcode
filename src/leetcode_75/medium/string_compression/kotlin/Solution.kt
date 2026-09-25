// https://leetcode.com/problems/string-compression/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.string_compression.kotlin

class Solution {
    fun compress(chars: CharArray): Int {
        var write = 0
        var read = 0
        while (read < chars.size) {
            val current = chars[read]
            var count = 0
            while (read < chars.size && chars[read] == current) {
                read++
                count++
            }
            chars[write++] = current
            if (count > 1) for (d in count.toString()) chars[write++] = d
        }
        return write
    }
}