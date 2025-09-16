fun printBorder() {
    repeat(23) {
        print("=")
    }
    println() // xuống dòng sau khi in border
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}

fun main() {
    // Ví dụ gọi hàm
    printBorder()
    printCakeBottom(age = 4, layers = 3)

    // Ví dụ if / else
    val num = 4
    if (num > 4) {
        println("The variable is greater than 4")
    } else if (num == 4) {
        println("The variable is equal to 4")
    } else {
        println("The variable is less than 4")
    }

    // --- when với rollResult và luckyNumber ---
    val luckyNumber = 6
    val rollResult = (1..6).random() // tạo giá trị ví dụ (1..6)
    println("Rolled: $rollResult (lucky: $luckyNumber)")
    when (rollResult) {
        luckyNumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        4 -> println("No luck! You rolled a 4. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
        else -> println("Impossible roll.")
    }

    // --- map diceRoll sang "drawable" (console-friendly) ---
    val diceRoll = (1..6).random()
    val drawableResourceName = when (diceRoll) {
        1 -> "dice_1"
        2 -> "dice_2"
        3 -> "dice_3"
        4 -> "dice_4"
        5 -> "dice_5"
        else -> "dice_6"
    }
    println("diceRoll: $diceRoll -> drawableResourceName: $drawableResourceName")

    // Nếu bạn đang trong project Android (Activity/Fragment), dùng (bỏ comment và trong context Android):
    // val drawableResource = when (diceRoll) {
    //     1 -> R.drawable.dice_1
    //     2 -> R.drawable.dice_2
    //     3 -> R.drawable.dice_3
    //     4 -> R.drawable.dice_4
    //     5 -> R.drawable.dice_5
    //     else -> R.drawable.dice_6
    // }
}
