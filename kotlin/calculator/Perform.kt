class Perform(){
    fun add(x: Double, y: Double): Double{
        return x+y
    }
    fun subtract(x: Double, y: Double): Double{
        return x-y
    }
    fun multiply(x: Double, y: Double): Double{
        return x*y
    }
    fun divide(x: Double, y: Double): Double{
        return x/y
    }
    fun convertToFeet(inches:Int): Unit{
        
        val feet: Int = inches/12
        val leftoverInches: Int = inches%12
        print("$inches inches is equal to $feet feet and $leftoverInches inches. ")
    }
}