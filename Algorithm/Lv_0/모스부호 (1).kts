class Solution {
    fun solution(letter: String): String {
        var answer: String = ""
        var morse: List<String> = mutableListOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
        var array = letter.split(" ")

        for(i in 0..array.size - 1) {
            when(array[i]) {
                ".-" -> answer += "a"
                "-..." -> answer += "b"
                "-.-." -> answer += "c"
                "-.." -> answer += "d"
                "." -> answer += "e"
                "..-." -> answer += "f"
                "--." -> answer += "g"
                "...." -> answer += "h"
                ".." -> answer += "i"
                ".---" -> answer += "j"
                "-.-" -> answer += "k"
                ".-.." -> answer += "l"
                "--" -> answer += "m"
                "-." -> answer += "n"
                "---" -> answer += "o"
                ".--." -> answer += "p"
                "--.-" -> answer += "q"
                ".-." -> answer += "r"
                "..." -> answer += "s"
                "-" -> answer += "t"
                "..-" -> answer += "u"
                "...-" -> answer += "v"
                ".--" -> answer += "w"
                "-..-" -> answer += "x"
                "-.--" -> answer += "y"
                "--.." -> answer += "z"
            }
        }

        return answer
    }
}

