// 2023-01-02

// 프로그래머스 Lv1 (약수의 합)

class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        for (i in 1..n) {
            if (n % i == 0) answer += i
        }

        return answer
    }
}

// 가장 많은 답안
class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        answer = (1..n).filter { n % it == 0 }.sum()

        return answer
    }
}