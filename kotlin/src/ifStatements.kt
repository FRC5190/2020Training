import java.lang.Double.parseDouble
import java.util.Scanner

fun main(args: Array<String>) {

    val ifStatementsObject = ifStatements()
    ifStatementsObject.evenOrOdd()
    ifStatementsObject.testScore()
    ifStatementsObject.checkNum1()
    ifStatementsObject.remainder()
    ifStatementsObject.whenStatements()

}

class ifStatements() {

    init {
        println("initialized")
    }

    fun evenOrOdd() {
        var x = 7
        var y = x % 2
        if (y > 0) {
            println("odd")
        } else {
            println("even")
        }
    }

    fun testScore() {
        var reader = Scanner(System.`in`)
        print("Enter a test score: ")

        var testScore: Double = reader.nextDouble()
        var x = testScore.toInt()
        println(x)

        var range: Boolean? = true

        do {
            if (x >= 90 && x <= 100) {
                println("A")
                range = false
            } else if (x >= 80) {
                println("B")
                range = false
            } else if (x >= 70) {
                println("C")
                range = false
            } else if (x >= 60) {
                println("D")
                range = false
            } else if (x <= 59 && x >= 0) {
                println("F")
                range = false
            } else {
                range = true
                println("Reenter test score: ")

                var testScore: Double = reader.nextDouble()
                var x = testScore.toInt()
                println(x)
            }
        } while (range == true)
    }

    fun checkNum1() {
        var reader = Scanner(System.`in`)
        print("Enter a number: ")
        var isdouble: String = reader.next()

        var numeric = true
        try {
            val num = parseDouble(isdouble)
        } catch (e: NumberFormatException) {
            numeric = false
        }
        if (numeric)
            println("$isdouble is a number")
        else
            println("$isdouble is not a number")
    }

    fun remainder() {


        var reader = Scanner(System.`in`)

        var numeric: Boolean?


        do {
            numeric = true
            print("Enter a number: ")
            var a: String = reader.next()

            print("Enter a second number: ")
            var b: String = reader.next()

            try {
                val num = parseDouble(a)
                val num2 = parseDouble(b)
            } catch (e: NumberFormatException) {
                numeric = false
            }
            if (b == "0") {
                numeric = false
                println("b is 0")
            }

            if (numeric == true) {
                var a1 = java.lang.Double.parseDouble(a)
                var b1 = java.lang.Double.parseDouble(b)
                val remind = a1 % b1
                if (remind <= 0)
                    println("no remainder")
                else
                    println("remainder")
            }

        } while (numeric == false)

            }

    fun whenStatements() {
        var reader = Scanner(System.`in`)
        print("Enter a number: ")
        var value: Int = reader.nextInt()
        when (value) {
            1 -> print("one")
            2 -> print("two")
            3 -> print("three")
            4 -> print("four")
            5 -> print("five")

            else -> {
                print("out of range")
            }
        }
    }
}



