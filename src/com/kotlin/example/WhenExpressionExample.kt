package com.kotlin.example

fun main() {
    val x=17
    when(x){
        1-> print(" Number is ${x}")
        2,3-> print("Number is ${x}  or ${x+1}")

        in 4..18-> print("Number is ${x}")
        !in 9..18-> print("Number is ${x}")

        else ->
            print("Number is Unknow")
}}