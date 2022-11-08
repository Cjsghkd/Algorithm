// 2022-11-09

// 프로그래머스 Lv0 (배열의 평균값)

class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        var sum: Double = 0.0

        for (i in 0..numbers.size - 1) {
            sum += numbers[i]
        }

        answer = sum / numbers.size

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(numbers: IntArray): Double {
//        return numbers.average();
//    }
//}