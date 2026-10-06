// https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.easy.find_the_difference_of_two_arrays.kotlin

class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val arrNums1 = nums1.filter { f -> !nums2.contains(f) }.distinct()
        val arrNums2 = nums2.filter { f -> !nums1.contains(f) }.distinct()
        result.add(arrNums1)
        result.add(arrNums2)
        return result
    }
}
