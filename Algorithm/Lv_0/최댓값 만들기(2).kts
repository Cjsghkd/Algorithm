class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -100000000

        for(i in 0..numbers.size - 1) {
            for(j in 0..numbers.size - 1) {
                if(i == j) continue
                else if (numbers[i] * numbers[j] >= answer) answer = numbers[i] * numbers[j]
            }
        }

        return answer
    }
}

// 예시답안
class Solution {
    fun solution(numbers: IntArray): Int {
        val sorted = numbers.sorted()
        return max(sorted[0] * sorted[1], sorted[sorted.lastIndex] * sorted[sorted.lastIndex - 1]) // max(a,b) = a~b 까지의 범위 중에서 최대값을 구하는 메소드
    }
}

