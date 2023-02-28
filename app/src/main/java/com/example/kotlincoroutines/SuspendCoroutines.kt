package com.example.kotlincoroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    /*
    - suspend Function
     *icinde coroutine calistirilabilen fonksiyonlardir
     *istenildigi zaman durdurup devam edilebilir*/

    GlobalScope.launch{
        function()
    }
}

suspend fun function(){
    coroutineScope {
        delay(5000)
        println("Coroutine Scope in suspend function")
    }
}