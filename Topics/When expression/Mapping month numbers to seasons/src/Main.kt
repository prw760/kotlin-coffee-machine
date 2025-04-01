fun main() {
    println(when (readln().toInt()) { 12, in 1..2 -> "Winter"; in 3..5 -> "Spring"; in 6..8 -> "Summer"; in 9..11 -> "Fall"; else -> "Invalid month number" })
}