// https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.easy.find_the_highest_altitude.kotlin

class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var highestAltitude = 0
        var high = 0
        val arr = mutableListOf<Int>()
        arr.add(0)
        for (element in gain) {
            arr.add(element)
        }
        for (i in 0 until arr.size) {
            high += arr[i]
            highestAltitude = maxOf(high, highestAltitude)
        }
        return highestAltitude
    }
}