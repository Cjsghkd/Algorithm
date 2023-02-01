class Solution {
    fun solution(my_string: String): IntArray {
        var list: List<Int> = mutableListOf()

        my_string.map {
            if(it == '0') list += 0
            else if(it == '1') list += 1
            else if(it == '2') list += 2
            else if(it == '3') list += 3
            else if(it == '4') list += 4
            else if(it == '5') list += 5
            else if(it == '6') list += 6
            else if(it == '7') list += 7
            else if(it == '8') list += 8
            else if(it == '9') list += 9
        }

        var sortList = list.sorted()

        return sortList.toIntArray()

    }
}

// 예시답안
class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in my_string){
            if(i.toInt()-48 >= 0 && i.toInt()-48 <= 9) answer += i.toInt()-48
        }
        return answer.toList().sorted().toIntArray()
    }
}