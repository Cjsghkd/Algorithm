class Solution {
    fun solution(cipher: String, code: Int): String {
        var answer: String = ""
        var n1 = code - 1
        var n2 = cipher.length - 1

        for(i in n1..n2 step code) answer += cipher.substring(i, i+1)

        return answer
    }
}
