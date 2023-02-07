class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var st1: String = my_string.get(num1).toString()
        var st2: String = my_string.get(num2).toString()
        var stringBuilder = StringBuilder()

        stringBuilder.append(my_string)

        stringBuilder.insert(num1, st2)
        stringBuilder.delete(num1+1, num1+2)

        stringBuilder.insert(num2, st1)
        stringBuilder.delete(num2+1, num2+2)

        return stringBuilder.toString()
    }
}

// 예시답안
class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var stringArray = my_string.toCharArray()
        val tempValue = stringArray[num1]

        stringArray[num1] = stringArray[num2]
        stringArray[num2] = tempValue

        return stringArray.joinToString("")
    }
}