fun main() {
    when (readln().toInt()) {
        0, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> println("F")
        6, 10, 15, 28, 36, 45 -> println("T")
        100, 1000, 10000, 100000 -> println("P")
        else -> println("N")
    }
}