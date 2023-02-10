fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    for(i in 1..n) {
        when(i) {
            1 -> print("*")
            2 -> print("**")
            3 -> print("***")
            4 -> print("****")
            5 -> print("*****")
            6 -> print("******")
            7 -> print("*******")
            8 -> print("********")
            9 -> print("*********")
            10 -> print("**********")
        }
        println("")
    }
}

// 예시답안
fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)

    for (i in 0 until n) {
        for (j in 0..i) {
            print("*")
        }
        println("")
    }
}