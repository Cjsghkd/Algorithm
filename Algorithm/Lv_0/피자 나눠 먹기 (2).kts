class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 1

        for(i in 6..600 step(6)) {
            if(i % n == 0) break
            answer++
        }

        return answer
    }
}