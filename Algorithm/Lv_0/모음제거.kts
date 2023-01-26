class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""

        answer = my_string.replace("a|e|i|o|u".toRegex(), "")

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        return my_string.filterNot{ "aeiou".contains(it) }
    }
}