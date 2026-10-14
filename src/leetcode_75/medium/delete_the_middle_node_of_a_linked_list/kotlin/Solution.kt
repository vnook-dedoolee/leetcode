// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.delete_the_middle_node_of_a_linked_list.kotlin

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun deleteMiddle(head: ListNode?): ListNode? {
        if (head?.next == null) return null

        var count = 0
        var p = head
        while (p != null) {
            count++
            p = p.next
        }

        val middleIndex = count / 2

        var before = head
        var i = 0
        while (i < middleIndex - 1) {
            before = before!!.next
            i++
        }

        before!!.next = before.next!!.next

        return head
    }
}
