import java.lang.Thread.sleep

fun main(args: Array<String>) {

    val loopsObject = loops()
    loopsObject.basicForLoops()
    loopsObject.forLoops()
    loopsObject.whileLoop()
    loopsObject.forEachStatement()
    loopsObject.delay()

    //loops().basicForLoops()
    //loops().forLoops()
    //loops().whileLoop()
    //loops().forEachStatement()
    //loops().delay()

}

class loops() {

    init {
        println("initialized")
    }

    fun basicForLoops() {
        for (x in 0..10) println(x)
        for (x in 0 until 10) println(x)
        for (x in 0 until 10 step 2) println(x)
        for (x in 10 downTo 0 step 2) println(x)
    }

    fun forLoops() {
        val colors = listOf("red", "green", "blue")
        for (x in colors)
            println(x)

        for ((index, value) in colors.withIndex()) {
            println("the element at $index is $value")

        }
    }

    fun whileLoop() {
        var x = 0
        while (x <= 10) {
            println(x)
            ++x
        }
    }

    fun forEachStatement() {
        val cars = listOf("Bugatti Chiron", "McLaren 720S")
        cars.forEach {
            println(it)
        }
    }

    fun delay() {
        println("waiting for 2 seconds")
        sleep(2000)
        println("done")
    }
}


