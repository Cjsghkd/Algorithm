class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()

        for (i in 1..n step 2) {
            answer += i
        }

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(n: Int) = (0..n).filter { it % 2 == 1 }.toIntArray()
}