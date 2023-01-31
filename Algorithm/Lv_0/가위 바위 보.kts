class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""

        for(i in 0..rsp.length - 1) {
            if(rsp.substring(i, i+1) == "2") answer += "0"
            else if(rsp.substring(i, i+1) == "0") answer += "5"
            else answer += "2"
        }

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(rsp: String): String {
        var answer = ""

        rsp.map {
            when(it) {
                '0' -> answer += "5"
                '2' -> answer += "0"
                '5' -> answer += "2"
            }
        }

        return answer
    }
}