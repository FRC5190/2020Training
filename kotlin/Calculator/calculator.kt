fun main(){

    println(sum(1, 3))
}

fun sum(a: Int, b: Int): Int {

    return a+b
}

fun diff(a: Int, b: Int): Int {

    return a-b
}

fun product(a: Int, b: Int): Int{

    return a*b
}

fun quot(a: Int, b: Int): Int{

    return a/b
}

fun intoFeet(a: Int): String{

    return "what the"+ a/12 + a%12
}