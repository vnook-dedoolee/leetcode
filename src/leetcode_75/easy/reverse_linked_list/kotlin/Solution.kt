// https://leetcode.com/problems/reverse-linked-list/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.easy.reverse_linked_list.kotlin

class ListNode(var value: Int = 0) {
    var next: ListNode? = null
}

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr = head
        while (curr != null) {
            val n = curr.next
            curr.next = prev
            prev = curr
            curr = n
        }
        return prev
    }
}