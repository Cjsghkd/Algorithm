class Solution {
    fun solution(my_string: String, letter: String): String {
        var answer: String = ""

        answer = my_string.replace(letter, "")

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(my_string: String, letter: String) = my_string.replace(letter, "")
}