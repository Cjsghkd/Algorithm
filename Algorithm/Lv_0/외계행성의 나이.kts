class Solution {
    fun solution(age: Int): String {
        var answer: List<String> = listOf()
        var num = age
        var check = 0
        var correct = ""

        while(num > 0) {
            check = num % 10
            when(check) {
                0 -> answer += "a"
                1 -> answer += "b"
                2 -> answer += "c"
                3 -> answer += "d"
                4 -> answer += "e"
                5 -> answer += "f"
                6 -> answer += "g"
                7 -> answer += "h"
                8 -> answer += "i"
                9 -> answer += "j"
            }
            num /= 10
        }

        answer = answer.reversed()

        for (i in 0..answer.size - 1) {
            correct += answer[i]
        }

        return correct
    }
}

// 예시답안
class Solution {
    fun solution(age: Int): String {
        val sb = StringBuilder()
        var left = age
        while (left > 0) {
            sb.append('a' + left % 10)
            left /= 10
        }
        return sb.reversed().toString()
    }
}