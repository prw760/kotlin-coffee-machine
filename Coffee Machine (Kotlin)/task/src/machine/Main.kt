package machine

fun main() {

    println("Write how many ml of water the coffee machine has:")
    val water = readln().toInt()

    println("Write how many ml of milk the coffee machine has:")
    val milk = readln().toInt()

    println("Write how many grams of coffee beans the coffee machine has:")
    val coffeeBeans = readln().toInt()

    var cupsPossible = minOf(water / 200, milk / 50, coffeeBeans / 15)

    println("$cupsPossible cups of coffee can be made from the coffee machine with the current amount of ingredients.")

    println("Write how many cups of coffee you will need:")
    val cups = readln().toInt()

    if (cups <= cupsPossible) {
        println("Yes, I can make that amount of coffee (and even ${--cupsPossible} more than that)")
    } else {
        println("No, I can make only $cupsPossible cup(s) of coffee")
    }
}
