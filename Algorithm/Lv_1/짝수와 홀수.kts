// 2022-12-29

// 프로그래머스 Lv1 (짝수와 홀수)

class Solution {
    fun solution(num: Int): String {
        var answer = ""
        if (num % 2 == 0) answer = "Even"
        else answer = "Odd"
        return answer
    }
}

// 가장 많은 답안
class Solution {
    fun solution(num: Int): String {
        return if(num % 2 == 0) "Even" else "Odd"
    }
}