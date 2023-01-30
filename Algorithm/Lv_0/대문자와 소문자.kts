class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        var str = my_string

        for (i in 0..str.length - 1) {
            if(str.get(i).isUpperCase()) {
                answer += str.get(i).toLowerCase()
            } else answer += str.get(i).toUpperCase()
        }

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(my_string: String)= my_string.map{
        if(it.isUpperCase()) it.lowercase()
        else it.uppercase()
    }.joinToString("")
}