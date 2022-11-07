// 2022-11-07

// 프로그래머스 Lv0 (나이 출력)

class Solution {
    fun solution(age: Int): Int {
        var answer: Int = 0

        answer = 2022 - (age - 1)

        return answer
    }
}

// 가장 많은 답안
//class Solution {
//    fun solution(age: Int): Int {
//        var answer: Int = 0
//
//        answer = 2022-age+1
//
//        return answer
//    }
//}