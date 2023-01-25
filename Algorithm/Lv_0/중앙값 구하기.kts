class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0

        array.sort() // .sort() 는 배열을 오름차순으로 정렬해주는 메소드입니다
        answer = array[array.size / 2]

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(array: IntArray) = array.sorted()[array.size / 2]
}