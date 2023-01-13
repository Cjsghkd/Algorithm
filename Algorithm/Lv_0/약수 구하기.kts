class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()

        for (i in 1..n) {
            if (n % i == 0) {
                answer += i
            }
        }
        return answer
    }
}

// 예시 답안
class Solution {
    fun solution(n: Int) = (1..n).filter { n % it == 0 }
}