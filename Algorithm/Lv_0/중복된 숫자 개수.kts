// 2022-11-11

// 프로그래머스 Lv0 (중복된 숫자 개수)

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = 0
        var count = 0

        for (i in 0..array.size - 1) {
            if (array[i] == n) count++
        }

        answer = count

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(array: IntArray, n: Int): Int = array.count { it == n }
//}