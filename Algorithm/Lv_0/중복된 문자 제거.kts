class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        var list: List<Char> = my_string.toList().distinct() // List.distinct() = List 안에 중복된 값을 삭제해주는 메소드

        for(i in list) {
            answer += i.toString()
        }

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(my_string: String): String = my_string.toList().distinct().joinToString("") // Array/List.joinToString("") = 배열을 가로안에 구분자를 통해(지금은 ""이니 그냥 바로 변환) String 형식으로 바꿔주는 메소드
}