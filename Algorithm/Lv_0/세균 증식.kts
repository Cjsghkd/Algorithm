// 2022-11-02

// 프로그래머스 Lv0 (세균 증식)

class Solution {
    fun solution(n: Int, t: Int): Int {
        var answer: Int = 0
        var num: Int = n
        var time: Int = t

        while (time > 0) {
            num = num * 2
            time -= 1
        }

        answer = num

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(n: Int, t: Int): Int {
//        var answer: Int = n
//        for(time in 1..t) {
//            answer *= 2
//        }
//        return answer
//    }
//}