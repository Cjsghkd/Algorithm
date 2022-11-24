// 2022-11-24

// 프로그래머스 Lv0 (배열 자르기)

class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        var answer: IntArray = intArrayOf()

        answer = numbers.slice(num1..num2).toIntArray()

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(numbers: IntArray, num1: Int, num2: Int) = numbers.sliceArray(num1..num2)
//}