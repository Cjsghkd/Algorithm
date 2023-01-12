class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        for(i in 0..numlist.size - 1) {
            if(numlist[i] % n == 0) {
                answer += numlist[i]
            }
        }

        return answer
    }
}

// 예시 답안
class Solution {
    fun solution(n: Int, numList: IntArray) = numList.filter { it % n == 0 }.toIntArray()
}
