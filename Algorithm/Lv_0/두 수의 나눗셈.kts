// 2022-11-09

// 프로그래머스 Lv0 (두 수의 나눗셈)

class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        var n1: Double = num1.toDouble()
        var n2: Double = num2.toDouble()
        var sum: Double = 0.0

        sum = (n1 / n2) * 1000
        answer = sum.toInt()

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(num1: Int, num2: Int) = num1 * 1000 / num2
//}