package com.example.kotlincoroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    //Coroutine Scope -> Scope olusturur ve icindeki tum coroutine'ler bitene kadar calismaya devam eder
    //context -> Coroutine'lerin hangi verilerle calisacagini bildirir
    println("Coroutine Scope start")
    CoroutineScope(Dispatchers.Default).launch {
        delay(5000)
        println("Coroutine Scope")
    }
    println("Coroutine Scope end")
}