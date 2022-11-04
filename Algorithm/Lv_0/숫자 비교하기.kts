// 2022-11-04

// 프로그래머스 Lv0 (숫자 비교하기)

class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0

        if (num1 == num2) answer = 1
        else answer = -1

        return answer
    }
}

// 가장 많은 답안
//class Solution {
//    fun solution(num1: Int, num2: Int) = if(num1==num2) 1 else -1
//}