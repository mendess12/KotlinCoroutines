package com.example.kotlincoroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    //repeat ->yapilacak islemin kaç defa yapilacagini ayarlar (tekrar sayisi)
    GlobalScope.launch {
        repeat(100_000) {
            launch {
                println("Kotlin Coroutines")
            }
        }
    }

    //Global Scope -> Butun application icerisinde calistirabilecegimiz bir kapsamda acar
    println("Global Scope start")
    GlobalScope.launch {
        delay(5000)
        println("Global Scope")
    }
    println("Global Scope end")
}