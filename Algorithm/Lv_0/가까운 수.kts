import kotlin.math.abs

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = 0
        var min = 100

        for(i in array) {
            if(min > abs(n - i)) min = abs(n - i) // abs()는 가로안에 수를 절대값으로 만들어주는 메소드
        }

        for(i in array.sorted()) {
            if(min == abs(n - i)) {
                answer = i
                break
            }
        }

        return answer
    }
}

// 예시답안
import kotlin.math.abs

class Solution {
    fun solution(array: IntArray, n: Int) = array.sorted().minWithOrNull(compareBy { abs(it - n) })!!
}