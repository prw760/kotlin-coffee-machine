package machine
import kotlin.math.min

var amountWater: Int = 400
var amountMilk: Int = 540
var amountCoffeeBeans: Int = 120
var amountCups: Int = 9
var amountMoney: Int = 550

fun printCoffeeMachineState() {
    println("\nThe coffee machine has:")
    println("$amountWater ml of water")
    println("$amountMilk ml of milk")
    println("$amountCoffeeBeans g of coffee beans")
    println("$amountCups disposable cups")
    println("$$amountMoney of money\n")
}

fun main() {

    printCoffeeMachineState()

    println("Write action (buy, fill, take):")
    var action = readln()
    while (action != "exit") {
        when (action) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            "remaining" -> {}
            else -> break
        }
        printCoffeeMachineState()
        println("Write action (buy, fill, take):")
        action = readln()
    }
}

fun buy () {

    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
    val coffeeType = readln().toInt()

    val espressosPossible = min(amountWater / 250, amountCoffeeBeans / 16)
    val lattesPossible = min(min(amountWater / 350, amountMilk / 75), amountCoffeeBeans / 20)
    val cappuccinosPossible = min(min(amountWater / 200, amountMilk / 100), amountCoffeeBeans / 12)

    when (coffeeType) {
        1 -> {
            if (espressosPossible > 0) {
                amountWater -= 250
                amountCoffeeBeans -= 16
                amountMoney += 4
                amountCups -= 1
            }
        }

        2 -> {
            if (lattesPossible > 0) {
                amountWater -= 350
                amountMilk -= 75
                amountCoffeeBeans -= 20
                amountMoney += 7
                amountCups -= 1
            }
        }

        3 -> {
            if (cappuccinosPossible > 0) {
                amountWater -= 200
                amountMilk -= 100
                amountCoffeeBeans -= 12
                amountMoney += 6
                amountCups -= 1
            }
        }
    }
}

fun fill() {
    println("Write how many ml of water you want to add:")
    val water = readln().toInt()
    amountWater += water

    println("Write how many ml of milk you want to add:")
    val milk = readln().toInt()
    amountMilk += milk

    println("Write how many grams of coffee beans you want to add:")
    val coffeeBeans = readln().toInt()
    amountCoffeeBeans += coffeeBeans

    println("Write how many disposable cups you want to add:")
    val cups = readln().toInt()
    amountCups += cups
}

fun take() {
    println("I gave you $$amountMoney")
    amountMoney = 0
}






    /*println("Write how many ml of water the coffee machine has:")
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
 */

