class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = -1
        var check: List<Int> = mutableListOf()
        var numString = num.toString()

        for(i in 0..numString.length - 1) {
            check += numString.substring(i, i+1).toInt()
        }

        for(i in 0..check.size - 1) {
            if(check[i] == k) {
                answer = i + 1
                break
            }
        }

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(num: Int, k: Int): Int {
        val result = num.toString().indexOf(k.toString())  // indexOf() : 가로 안 변수에 해당하는 문자의 인덱스 값을 반환하고 찾지 못했을 경우 -1을 반환
        if(result >=0) return result +1
        return result
    }
}
