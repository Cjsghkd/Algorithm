class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var check = 0

        for(i in 4..n) {
            for(j in 1..i) {
                if(i % j == 0) check++
            }
            if(check >= 3) answer++
            check = 0
        }

        return answer
    }
}
