// 2022-11-08

// 프로그래머스 Lv0 (각도기)
class Solution {
    fun solution(angle: Int): Int {
        var answer: Int = angle

        if (answer > 0 && answer < 90) {
            answer = 1
        } else if (answer == 90) {
            answer = 2
        } else if (answer > 90 && answer < 180) {
            answer = 3
        } else if (answer == 180) {
            answer = 4
        }

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(angle: Int): Int {
//        return when (angle) {
//            in 1 .. 89 -> 1
//            90 -> 2
//            180 -> 4
//            else -> 3
//        }
//    }
//}