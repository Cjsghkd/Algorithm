// 2022-11-25

// 프로그래머스 Lv0 (아이스 아메리카노)

class Solution {
    fun solution(money: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var count = 0
        var my = money

        while(true) {
            if (my >= 5500) {
                my -= 5500
                count++
            }
            else break
        }

        answer = answer.plus(count)
        answer = answer.plus(my)

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(money: Int) = intArrayOf(money / 5500, money % 5500)
//}