// 2022-11-27

// 프로그래머스 Lv0 (가장 큰 수 찾기)

class Solution {
    fun solution(array: IntArray): IntArray {
        var count = 0;
        var max = 0;

        for (i in 0..array.size - 1) {
            if (array[i] > max) {
                max = array[i]
                count = i
            }
        }

        var answer: IntArray = intArrayOf(max, count)

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(array: IntArray) = intArrayOf(array.maxOf { it }, array.indexOf(array.maxOf { it }))
//}