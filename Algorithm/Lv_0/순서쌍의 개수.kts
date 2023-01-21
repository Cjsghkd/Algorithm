class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var num = n

        for (i in 1..n) {
            if (n % i == 0) answer++
        }

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(n: Int) = (1..n).count { n % it == 0 }
}