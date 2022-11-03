// 2022-11-01

// 프로그래머스 Lv0 (자릿수 더하기)

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var sum: Int = 0
        var num: Int = n

        while (num > 0) {
            sum += num % 10
            num = num / 10
        }

        answer = sum

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(n: Int): Int = n.toString().toCharArray().sumOf { it.toString().toInt() }
//}