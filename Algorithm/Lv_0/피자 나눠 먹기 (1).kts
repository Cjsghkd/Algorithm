// 2022-11-15

// 프로그래머스 Lv0 (피자 나눠 먹기 (1))

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 1
        var num = n / 7

        if (n % 7 == 0) return num
        else return num + answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(n: Int) = n / 7 + if (n % 7 > 0) 1 else 0
//}
