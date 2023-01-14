class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var answer: IntArray = intArrayOf()
        var maxIndex = numbers.size - 1

        if(direction == "right") {
            answer += numbers[maxIndex]
            for (i in 0..maxIndex - 1) {
                answer += numbers[i]
            }
        }

        if(direction == "left") {
            for(i in 1..maxIndex) {
                answer += numbers[i]
            }
            answer += numbers[0]
        }

        return answer
    }
}

// 예시 답안
class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        val numberList = numbers.toMutableList()

        if (direction == "right") {
            numberList.add(0, numberList.last())
            numberList.removeAt(numberList.lastIndex)
        } else {
            numberList.add(numberList.first())
            numberList.removeAt(0)
        }
        return numberList.toIntArray()
    }
}