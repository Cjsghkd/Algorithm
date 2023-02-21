class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var answer: Int = 0

        for(n1 in i..j) {
            for(n2 in 0..n1.toString().length - 1) {
                if(n1.toString().get(n2).toString() == k.toString()) answer++
            }
        }

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(i: Int, j: Int, k: Int): Int = (i..j).joinToString("").count { it.digitToInt() == k }
}

// String.count() { 조건식 } = 문자열중에 조건식에 해당하는 문자가 몇개 있는지 알려주는 메소드
// Char.digitToInt() = 문자를 명시적으로 Int형으로 바꿔주는 메소드