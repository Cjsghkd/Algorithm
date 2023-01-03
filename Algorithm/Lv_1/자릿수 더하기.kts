// 2023-01-03

// 프로그래머스 Lv1 (자릿수 더하기)

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var num = n

        while (num > 0) {
            answer += (num % 10)
            num /= 10
        }

        return answer
    }
}

// 예시 답안
class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        for (nn in n.toString()) {
            answer += (nn.toString()).toInt()
        }

        return answer
    }
}
