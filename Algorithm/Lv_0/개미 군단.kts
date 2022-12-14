// 2022-12-14

// 프로그래머스 Lv0 (개미 군단)

class Solution {
    fun solution(hp: Int): Int {
        var rhp = hp
        var count = 0
        while(rhp > 0) {
            if (rhp >= 5) {
                count++
                rhp -= 5
                continue
            }
            else if (rhp >= 3) {
                count++
                rhp -= 3
                continue
            }
            else {
                count++
                rhp--
            }
        }
        return count
    }
}

// 가장 많은 답안
class Solution {
    fun solution(hp: Int) = hp / 5 + hp % 5 / 3 + hp % 5 % 3
}