// https://leetcode.com/problems/keys-and-rooms/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.keys_and_rooms.kotlin

class Solution {
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val visited = mutableSetOf(0)
        val keys = rooms[0].toMutableList()
        while (keys.isNotEmpty()) {
            val key = keys.removeAt(keys.lastIndex)
            if (key !in visited) {
                visited.add(key)
                keys.addAll(rooms[key])
            }
        }

        return visited.size == rooms.size
    }
}
