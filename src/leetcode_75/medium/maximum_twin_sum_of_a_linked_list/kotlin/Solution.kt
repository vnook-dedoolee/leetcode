// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.maximum_twin_sum_of_a_linked_list.kotlin

class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null
}

class Solution {
    fun pairSum(head: ListNode?): Int {
        var slow = head
        var fast = head
        while (fast?.next != null) {
            slow = slow!!.next
            fast = fast.next!!.next
        }

        var prev: ListNode? = null
        var cur = slow
        while (cur != null) {
            val next = cur.next
            cur.next = prev
            prev = cur
            cur = next
        }

        var result = 0
        var a = head
        var b = prev
        while (b != null) {
            result = maxOf(result, a!!.`val` + b.`val`)
            a = a.next
            b = b.next
        }
        return result
    }
}