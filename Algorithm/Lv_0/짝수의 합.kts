// 2022-11-09

// 프로그래머스 Lv0 (짝수의 합)

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        for (i in 0..n step(2)) {
            answer += i
        }

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(n: Int): Int {
//        var answer: Int = 0
//        for(i in 0..n){
//            if(i % 2 == 0){
//                answer += i
//            }
//        }
//        return answer
//    }
//}