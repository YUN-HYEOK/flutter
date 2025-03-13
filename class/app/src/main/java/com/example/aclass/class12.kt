package com.example.aclass

fun generteMultiple(num:Int): (Int) -> Int{
    return {n -> n * num}
}

fun main(){
    var double = generteMultiple(2)
    println(double(5))
}