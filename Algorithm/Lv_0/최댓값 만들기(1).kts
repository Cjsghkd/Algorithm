// 2022-11-16

// 프로그래머스 Lv0 (최댓값 만들기(1))

class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var max = 0
        var mmax = 0

        for (i in 0..numbers.count() - 1) {
            if (max < numbers[i]) {
                mmax = max
                max = numbers[i]
                continue
            }
            if (mmax < numbers[i]) {
                mmax = numbers[i]
            }
        }

        answer = max * mmax

        return answer
    }
}

// 다른 사람의 풀이
// class Solution {
//    fun solution(numbers: IntArray): Int {
//        val sortedNumbers = numbers.sorted() // 오름차순 정렬
//                                   .sortedDescending() // 내림차순 정렬
//
//        return sortedNumbers[sortedNumbers.size - 1] * sortedNumbers[sortedNumbers.size - 2]
//    }
//}