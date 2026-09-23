package leetcode_75.easy.greatest_common_divisor_of_strings.kotlin

class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        if (str1 + str2 != str2 + str1) {
            return ""
        }
        val gcd = str1.length.gcd(str2.length)
        return str1.substring(0, gcd)
    }

    fun Int.gcd(other: Int): Int {
        var a = this
        var b = other
        while (b != 0) {
            val n = b
            b = a % b
            a = n
        }
        return a
    }

}
