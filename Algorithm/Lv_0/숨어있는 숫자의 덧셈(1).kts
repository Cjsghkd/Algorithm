class Solution {
    fun solution(my_string: String): Int {
        var answer: String = ""
        var num = 0

        answer = my_string.filter {
            it < 'A'
        }

        for(i in 0..answer.length - 1) num += answer.substring(i, i+1).toInt()

        return num

    }
}

// 예시답안
class Solution {
    fun solution(my_string: String): Int {
        var sum = 0
        for (i in my_string) { // 49~57
            if(49 <= i.toInt() && i.toInt() <= 57) sum += i.toString().toInt()
        }
        return sum
    }
}