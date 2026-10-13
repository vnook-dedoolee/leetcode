// https://leetcode.com/problems/number-of-recent-calls/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.easy.number_of_recent_calls.kotlin

class RecentCounter() {

    private val queue = ArrayDeque<Int>()
    
    fun ping(t: Int): Int {
        queue.addLast(t)
        while (queue.first() < t - 3000) {
            queue.removeFirst()
        }
        return queue.size
    }
}
