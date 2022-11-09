// 2022-11-09

// 프로그래머스 Lv0 (양꼬치)

class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        var service = 2000
        var stick = n
        var drink = k

        service *= (n / 10)
        stick *= 12000
        drink *= 2000

        answer = (stick + drink) - service

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(n: Int, k: Int) = n * 12000 + k * 2000 - ((n / 10) * 2000)
//}