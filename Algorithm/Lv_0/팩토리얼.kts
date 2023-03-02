class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 1

        for(i in 10 downTo 1) {
            if(fac(i) <= n) {
                answer = i
                break
            }
        }

        return answer
    }

    fun fac(n: Int): Int {
        return if(n == 1) 1
        else n * fac(n - 1)
    }
}

// 예시답안
class Solution {
    fun solution(n: Int) = (2..n).find { n < factorial(it) }?.dec() ?: n

    private tailrec fun factorial(n: Int, run: Int = 1): Int = if (n == 1) run else factorial(n - 1, run * n) // 꼬리재귀
}