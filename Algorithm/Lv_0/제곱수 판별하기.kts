class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 2
        var num = 1
        var check = 0

        while(n != check) {
            if (num > 1000) break
            check = num * num
            num++
        }

        if (n == check) answer = 1

        return answer
    }
}

// 예시답안
import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        val sqrt = sqrt(n.toDouble()).toLong() // sqrt는 ()안에 숫자의 제곱근을 알려주는 함수이다.
        return if(sqrt*sqrt == n.toLong()) 1 else 2
    }
}