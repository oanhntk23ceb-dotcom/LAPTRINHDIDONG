class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}

fun main() {
    val myFirstDice = Dice(6)
    println("Your dice rolled: ${myFirstDice.roll()}")
}
