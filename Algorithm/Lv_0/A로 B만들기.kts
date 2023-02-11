class Solution {
    fun solution(before: String, after: String): Int {
        var answer: Int = 0
        var before_list: List<String> = mutableListOf()
        var after_list: List<String> = mutableListOf()
        var before_sort: List<String> = mutableListOf()
        var after_sort: List<String> = mutableListOf()

        before.forEach { i ->
            before_list += i.toString()
        }

        after.forEach { i ->
            after_list += i.toString()
        }

        before_sort = before_list.sorted()
        after_sort = after_list.sorted()

        if (before_sort == after_sort) answer = 1

        return answer
    }
}

// 예시 답안
class Solution {
    fun solution(before: String, after: String): Int =
        if (before.toList().sorted() == after.toList().sorted()) 1 else 0
}

