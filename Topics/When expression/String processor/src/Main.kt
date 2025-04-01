fun main() {

    val inputString1 = readln()
    val operator = readln()
    val inputString2 = readln()

    when (operator) {
        "equals" -> println(inputString1 == inputString2)
        "plus" -> println(inputString1 + inputString2)
        "endsWith" -> println(inputString1.endsWith(inputString2))
        else -> println("Unknown operation")
    }
}