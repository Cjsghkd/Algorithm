// 2022-11-21

// 프로그래머스 Lv0 (점의 위치 구하기)

class Solution {
    fun solution(dot: IntArray): Int {
        if (dot[0] > 0 && dot[1] > 0) return 1
        else if (dot[0] < 0 && dot[1] > 0) return 2
        else if (dot[0] < 0 && dot[1] < 0) return 3
        else if (dot[0] > 0 && dot[1] < 0) return 4

        return 0
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(dot: IntArray) = when {
//        (dot[0] > 0 && dot[1] > 0) -> 1
//        (dot[0] < 0 && dot[1] > 0) -> 2
//        (dot[0] < 0 && dot[1] < 0) -> 3
//        else -> 4
//    }
//}