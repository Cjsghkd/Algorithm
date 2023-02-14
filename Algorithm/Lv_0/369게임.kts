class Solution {
    fun solution(order: Int): Int {
        var answer: Int = 0
        var order_string = order.toString()

        for(i in 0..order_string.length - 1) {
            if(order_string.get(i) == '3' || order_string.get(i) == '6' || order_string.get(i) == '9') answer++
        }

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(order: Int): Int = order.toString().count { it == '3' || it == '6' || it == '9' } // .count { } : 괄호 안에 조건에 맞는 문자 개수를 알려주는 메소드
}