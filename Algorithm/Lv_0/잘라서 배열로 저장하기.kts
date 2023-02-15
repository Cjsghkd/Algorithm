class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        for (i in 0..my_str.length - 1 step(n)) {
            if (my_str.length >= i + n) {
                answer += my_str.substring(i, i + n)
            } else {
                answer += my_str.substring(i) // i번째 인덱스 부터 마지막까지 전부
            }
        }

        return answer
    }
}

