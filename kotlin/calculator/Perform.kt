package calculator

class Perform {

    fun sum(a: Double, b: Double): Double {

        return a + b
    }

    fun diff(a: Double, b: Double): Double {

        return a - b
    }

    fun prod(a: Double, b: Double): Double {

        return a * b
    }

    fun quot(a: Double, b: Double): Double {

        return a / b
    }

    fun intoFeet(a: Double): String {

        return "The conversion is " + a / 12 + " feet and " + a % 12 + " inches."
    }
}