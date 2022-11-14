// 2022-11-14

// 프로그래머스 Lv0 (배열 뒤집기)

class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        num_list.reverse()
        answer = num_list

        return answer
    }
}

// 가장 많은 답안
// class Solution {
//    fun solution(num_list: IntArray) = num_list.reversed()
//}

// reverse() : 배열을 뒤집은 후 호출한 배열에 적용하는 Unit 함수
// reversed() : 배열을 뒤집은 후 새로운 객체에 할당하는 List 반환형 함수
// reversedArray() : 배열을 뒤집은 후 새로운 객체에 할당하는 Array 반환형 함수