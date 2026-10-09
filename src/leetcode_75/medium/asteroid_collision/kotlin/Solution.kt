// https://leetcode.com/problems/asteroid-collision/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.asteroid_collision.kotlin

class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = mutableListOf<Int>()
        for (i in asteroids) {
            var alive = true
            while (alive && i < 0 && stack.isNotEmpty() && stack.last() > 0) {
                val top = stack.last()
                if (top < -i) {
                    stack.removeAt(stack.size - 1)
                } else if (top == -i) {
                    stack.removeAt(stack.size - 1)
                    alive = false
                } else {
                    alive = false
                }
            }
            if (alive) stack.add(i)
        }
        return stack.toIntArray()
    }
}