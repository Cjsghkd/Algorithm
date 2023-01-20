class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0

        for (i in 0..s1.size - 1) {
            for (j in 0..s2.size - 1) {
                if (s1[i] == s2[j]) answer++
            }
        }

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int = s1.count { s2.contains(it) }
}