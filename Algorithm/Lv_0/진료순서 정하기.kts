class Solution {
    fun solution(emergency: IntArray): IntArray {
        var answer: List<Int> = listOf()
        var list: IntArray = intArrayOf()

        for(i in 0..emergency.size - 1) {
            answer += emergency[i]
        }

        answer = answer.sorted()

        for(i in (answer.size - 1) downTo 0) {
            list += answer[i]
        }

        for(i in 0..list.size - 1) {
            emergency[i] = list.indexOf(emergency[i]) + 1
        }

        return emergency
    }
}

// 예시답안
class Solution {
    fun solution(e: IntArray) = e.map { e.sortedDescending().indexOf(it) + 1 }.toIntArray()  // sortedDescending() = 내림차순정렬 (높은순으로)
}