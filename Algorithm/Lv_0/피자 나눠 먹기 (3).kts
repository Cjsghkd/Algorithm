// 2022-11-18

// 프로그래머스 Lv0 (피자 나눠 먹기 (3))

class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 0

        if (n % slice == 0) answer = n / slice
        else answer = (n / slice) + 1

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(slice: Int, n: Int) = n / slice + if (n % slice > 0) 1 else 0
//}