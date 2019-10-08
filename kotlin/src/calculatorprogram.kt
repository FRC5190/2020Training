
import java.util.Scanner

    fun main(args: Array<String>) {
        // Creates an instance which takes input from standard input (keyboard)
        val reader = Scanner(System.`in`)
        print("Enter a number: ")

        // nextInt() reads the next integer from the keyboard
        var int1: Int = reader.nextInt()
        //println("You entered: $int1")


        print("Enter second number: ")


        var int2: Int = reader.nextInt()
        //println("You entered: $int2")

        println("Inches:")
        var int3: Int = reader.nextInt()


        val sum = Perform().sum(x = int1, y = int2)
        val difference = Perform().difference(x = int1, y = int2)
        val product = Perform().product(x = int1, y = int2)
        val quotient = Perform().quotient(x = int1, y = int2)
        val intoft = Perform().intoft(x = int3)
        val leftinch = Perform().remainder(x = int3)

        println("sum = $sum")
        println("difference = $difference")
        println("product = $product")
        println("quotient = $quotient")
        println("feet = $intoft")
        println("leftover inches = $leftinch")

    }

class Perform() {
    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun difference(x: Int, y: Int): Int {
        return x - y

    }

    fun product(x: Int, y: Int): Int {
        return x * y

    }

    fun quotient(x: Int, y: Int): Int {
        return x / y

    }

    fun intoft(x: Int): Int {
        return x / 12

    }

    fun remainder(x: Int): Int {
        return x % 12
    }
}
