package com.example.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    runBlocking {
        val firstJob = launch {
            delay(2000)
            println("first Job")
            val secondJob = launch {
                delay(3000)
                println("second job")
            }
        }

        firstJob.invokeOnCompletion {
            println("first job end ")
        }

        firstJob.cancel()
    }
}