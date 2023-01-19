class Solution {
    fun solution(my_string: String, n: Int): String {
        var sa: List<String> = my_string.split("")
        var answer: String = ""

        for(i in 0..sa.size - 1) {
            for(j in 1..n) {
                answer += sa[i]
            }
        }

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""

        for(i in my_string){
            for(j in 1..n){
                answer += i
            }
        }

        return answer
    }
}