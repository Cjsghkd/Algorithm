// 2022-11-22

// 프로그래머스 Lv0 (짝수 홀수 개수)

class Solution {
    fun solution(num_list: IntArray): IntArray {
        var x = 0
        var y = 0

        for(i in 0..num_list.size - 1) {
            if (num_list[i] % 2 == 0) x++
            else y++
        }

        var answer: IntArray = intArrayOf(x, y)

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(num_list: IntArray): IntArray {
//        var answer = intArrayOf(0,0)
//
//        num_list.forEach{
//            if(it%2==0) answer[0]++
//            else answer[1]++
//        }
//
//        return answer
//    }
//}