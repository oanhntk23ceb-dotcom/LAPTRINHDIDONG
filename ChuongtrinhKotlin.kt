fun main() {
    println("Hello, world!")
    println("This is the text to print!")
// This is a comment line.
// This is another comment.
    // Assign once, cannot change.
    val age = "5"
    val name = "Rover"

// Assign and change as needed.
    var roll = 6
    var rolledValue: Int = 4
    println("You are already ${age}!")
    println("You are already ${age} days old, ${name}!")
    // Define the function.
    fun printHello () {
        println ("Hello Kotlin")
    }

// Call the function.
    printHello()
    fun printBorder(border: String, timesToRepeat: Int) {
        repeat(timesToRepeat) {
            print(border)
        }
        println()
    }
    fun roll(): Int {
        val randomNumber = (1..6).random()
        return randomNumber
    }
    val diceRange = 1..6
    val randomNumber = diceRange.random()

    fun rollAndPrint() {
        val anotherRandomNumber = (1..6).random()
        println(randomNumber)
    }
}
