package com.example.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    //Dispatchers -> dispacther kullanilarak hangi thread'lerde calistirabildigimizi soyleyebiliriz

    runBlocking {
        //Dispatchers.IO -> Input/Output, Networking (internette veri cekme islemlerinde kullanilir)
        launch(Dispatchers.IO) {
            println("IO Thread : ${Thread.currentThread().name}")
        }
        //Dispatchers.Default -> CPU Intensive, (islemciyi cok kullanan islemlerde kullanilir)
        launch(Dispatchers.Default) {
            println("Default Thread : ${Thread.currentThread().name}")
        }
        //Dispatchers.Unconfined -> Inherited dispatcher (miras alma)
        launch(Dispatchers.Unconfined) {
            println("Unconfined Thread : ${Thread.currentThread().name}")
        }
    }
}