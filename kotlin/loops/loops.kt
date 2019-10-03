package loops


class Loops {
    fun basicForLoops() {

        for (x in 0..10) {
            println(x)

        }

        for (x in 0 until 10) {
            println(x)

        }

        for (x in 0..10 step 2) {
            println(x)

        }

        for (x in 10 downTo 0 step 2) {
            println(x)

        }

    }

    fun forLoops() {
        val colors = listOf("red", "blue", "green")

        for (x in colors) {
            println("$x")
        }

        for (x in colors) {
            println("$x" + " " + colors.indexOf(x))
        }

    }

    fun whileLoop() {
        var x = 0
        while (x < 10) {
            println(x)
            x += 1
        }
    }

    fun forEachStatement() {
        val senses = listOf("touch", "smell")

        senses.forEach() {
            println(it)
        }
    }

    fun delayTime() {

        var x = 0
        while (x < 2) {
            println("hello world!")
            x += 1
        }
    }
}
