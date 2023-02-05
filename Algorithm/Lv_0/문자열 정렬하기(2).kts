class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        var str: List<Char> = mutableListOf()

        str += my_string.lowercase().toList().sorted()

        for(i in 0..str.size - 1) answer += str[i]

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(my_string: String): String = my_string.lowercase().toCharArray().sorted().joinToString("")
}

// joinToString() = 배열을 붙여준다(String 형식으로 가공한다)  ("", "", "") 처음이 구분자(배열들 사이에 구분자를 넣는다), 두세번째가 시작과 끝인데 추가 옵션 느낌으로 맨처음과 맨 마지막에 문자를 추가할 수 있다.