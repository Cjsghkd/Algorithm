// 2022-11-03

// 프로그래머스 Lv0 (편지)

class Solution {
    fun solution(message: String): Int {
        var answer: Int = 0

        for(i in 0 until message.count()) {
            answer += 2
        }

        return answer
    }
}