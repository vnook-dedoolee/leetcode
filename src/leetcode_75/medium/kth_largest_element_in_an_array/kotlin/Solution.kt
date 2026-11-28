// https://leetcode.com/problems/kth-largest-element-in-an-array/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.kth_largest_element_in_an_array.kotlin

import java.util.PriorityQueue

class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val pq = PriorityQueue<Int>()
        for (n in nums) {
            pq.offer(n)
            if (pq.size > k) pq.poll()
        }
        return pq.peek()
    }
}
