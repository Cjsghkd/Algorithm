class Solution {
    fun solution(str1: String, str2: String): Int {
        var answer: Int = 2

        if (str1.contains(str2)) answer = 1

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(str1: String, str2: String) = if( str2 in str1 ) 1 else 2
}
