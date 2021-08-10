package com.kotlin.example

/*A higher-order function is a function that takes another function as parameter and/or returns a function.*/
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

/*fun sum(x:Int,y:Int):Int{
   return x+y
}*/
//fun sum(x:Int,y:Int):Int= x+y
fun sum(x: Int, y: Int) = x + y

fun main() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("mulResult $mulResult")
    println("sumResult $sumResult")


    val func = operation()
    println("squareResult ${func(2)}")
}

// Returning Functions
fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int): Int = x * x