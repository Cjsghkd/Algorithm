// 2022-11-24

// 프로그래머스 Lv0 (배열 두 배 만들기)

class Solution {
    fun solution(numbers: IntArray): IntArray {

        for (i in 0..numbers.size - 1) {
            numbers[i] *= 2
        }

        return numbers
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(numbers: IntArray) = numbers.map { it * 2 }
//}