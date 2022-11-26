// 2022-11-26

// 프로그래머스 Lv0 (삼각형의 완성조건(1))

class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        var max = 0
        var sum = 0

        for(i in 0..sides.size - 1) {
            sum += sides[i]
            if (max < sides[i]) max = sides[i]
        }

        sum -= max

        if (sum <= max) answer = 2
        else answer = 1

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(sides: IntArray): Int {
//        var sides = sides.sorted()
//        return if( sides[2] < sides[0]+sides[1] ) 1 else 2
//    }
//}