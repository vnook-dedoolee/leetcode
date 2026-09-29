// https://leetcode.com/problems/container-with-most-water/submissions/2156775236/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.container_with_most_water.kotlin

import kotlin.math.min
import kotlin.math.max

class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var result = 0
        while (left < right) {
            val area = min(height[left], height[right]) * (right - left)
            result = max(result, area)
            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }
        return result
    }
}
