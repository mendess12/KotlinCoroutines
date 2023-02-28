package com.example.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    //runBlocking -> Coroutine icin scope olusturur fakat bloke'layark olusturur
    println("Run Blocking start")
    runBlocking {
        launch {
            delay(5000)
            println("Run Blocking")
        }
    }
    println("Run Blocking end")
}
