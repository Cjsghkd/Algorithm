class Solution {
    fun solution(n: Long): List<Long> {
        var num = n
        var answer = arrayListOf<Long>()

        while(num > 0) {
            answer.add(num % 10)
            num /= 10
        }

        answer.reversed()

        return answer
    }
}


// 예시 답안
class Solution {
    fun solution(n: Long): IntArray {
        var num = n
        var answer = intArrayOf()

        while(num>0) {
            answer = answer + (num%10).toInt()
            num = num/10
        }

        return answer
    }
}