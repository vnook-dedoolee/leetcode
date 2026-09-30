// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.maximum_number_of_vowels_in_a_substring_of_given_length.kotlin

class Solution {
    
    val vowels = "aeiou"
    
    fun maxVowels(s: String, k: Int): Int {
        var count = 0
        var max = 0
        
        for (i in 0 until k) {
            if (s[i] in vowels) count++
        }
        max = count
        
        for (i in k until s.length) {
            if (s[i] in vowels) count++
            if (s[i - k] in vowels) count--
            if (count > max) max = count
        }

        return max
    }
}
