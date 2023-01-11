class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        for(x in 1..n) {
            if(n % x == 1) {
                answer = x
                break
            }
        }

        return answer
    }
}

// 예시 답안
class Solution {
    fun solution(n: Int): Int {
        var answer = 1

        while (n % answer != 1) {
            answer++
        }
        return answer
    }
}