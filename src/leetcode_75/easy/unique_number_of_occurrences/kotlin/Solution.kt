// https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.easy.unique_number_of_occurrences.kotlin

class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val freq = arr.toList().groupingBy { it }.eachCount()
        return freq.values.toSet().size == freq.size
    }
}
