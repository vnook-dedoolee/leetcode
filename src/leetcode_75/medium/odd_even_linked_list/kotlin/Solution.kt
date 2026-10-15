// https://leetcode.com/problems/odd-even-linked-list/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.odd_even_linked_list.kotlin

class ListNode(var value: Int = 0) {
    var next: ListNode? = null
}

class Solution {
    fun oddEvenList(head: ListNode?): ListNode? {
        if (head?.next == null) return head

        var odd: ListNode? = head
        var even: ListNode? = head.next
        val evenHead = even

        while (even?.next != null) {
            odd?.next = even.next
            odd = odd?.next
            even.next = odd?.next
            even = even.next
        }

        odd?.next = evenHead
        return head
    }
}