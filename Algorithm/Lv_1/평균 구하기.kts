// 2023-01-04

// 프로그래머스 Lv1 (평균 구하기)

class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0.0
        var sum = 0.0
        var count = 0

        for (i in 0..arr.size - 1) {
            sum += arr[i]
            count++
        }

        answer = sum / count

        return answer
    }
}

// 예시 답안
class Solution {
    fun solution(arr: IntArray): Double
    {
        return arr.average()
    }
}