// https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.easy.is_subsequence.kotlin

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        var j = 0
        while (i < s.length && j < t.length) {
            if (s[i] == t[j]) {
                i++
            }
            j++
        }
        return i == s.length
    }
}