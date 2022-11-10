// 2022-11-10

// 프로그래머스 Lv0 (머쓱이보다 키 큰 사람)

class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0
        var count = 0

        for(i in 0..array.size - 1) {
            if (height < array[i]) count++
        }

        answer = count

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(array: IntArray, height: Int): Int = array.count { it > height }
//}