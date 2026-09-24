// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.easy.kids_with_the_greatest_number_of_candies.kotlin

class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val result = mutableListOf<Boolean>()
        candies.forEach { candy ->
            if (candy + extraCandies >= candies.max()) {
                result.add(true)
            } else {
                result.add(false)
            }
        }
        return result
    }
}
