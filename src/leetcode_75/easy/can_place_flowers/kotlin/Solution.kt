package leetcode_75.easy.can_place_flowers.kotlin

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        if (n == 0) return true
        var flowersLeft = n
        for (i in flowerbed.indices) {
            val leftFree = i == 0 || flowerbed[i - 1] == 0
            val rightFree = i == flowerbed.lastIndex || flowerbed[i + 1] == 0
            if (flowerbed[i] == 0 && leftFree && rightFree) {
                flowerbed[i] = 1
                flowersLeft--
                if (flowersLeft == 0) return true
            }
        }
        return false
    }
}
