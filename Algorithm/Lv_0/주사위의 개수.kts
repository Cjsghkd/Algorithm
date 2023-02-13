class Solution {
    fun solution(box: IntArray, n: Int): Int {
        var answer: Int = 0
        var width = box[0] / n
        var length = box[1] / n
        var height = box[2] / n

        answer = width * length * height

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(box: IntArray, n: Int)= (box[0] / n) * (box[1] / n) * (box[2] / n)
}