class Solution {
    fun solution(strlist: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        for (i in 0..strlist.size - 1) {
            answer += strlist[i].length
        }

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(strList: Array<String>) = strList.map { it.length }.toIntArray()
}