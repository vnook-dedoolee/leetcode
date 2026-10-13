// https://leetcode.com/problems/dota2-senate/description/?source=submission-noac

package leetcode_75.medium.dota2_senate.kotlin

class Solution {
    fun predictPartyVictory(senate: String): String {
        val queue = mutableListOf<Char>()
        senate.forEach { s ->
            queue.add(s)
        }
        var idx = 0
        while (queue.size > 1) {
            if (queue[0] != queue[idx]) {
                val first = queue.removeFirst()
                idx -= 1
                queue.removeAt(idx)
                queue.add(first)
                idx = 0
            } else {
                idx = (idx + 1) % queue.size
                if (idx == 0) break
            }
        }
        return if (queue[0] == 'D') "Dire" else "Radiant"
    }
}
