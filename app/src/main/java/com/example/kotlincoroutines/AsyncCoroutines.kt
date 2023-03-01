package com.example.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {

    var userName = ""
    var userAge = 0

    runBlocking {

        val downloadedName = async {
            downloadName()
        }
        val downloadedAge = async {
            downloadAge()
        }
        userName = downloadedName.await()
        userAge = downloadedAge.await()
        println(
            "Name : ${userName}" +
                    " Age : ${userAge}"
        )
    }
}

suspend fun downloadName(): String {
    delay(2000)
    val userName = "Yusuf"
    println("user name download")
    return userName
}

suspend fun downloadAge(): Int {
    delay(4000)
    val userAge = 23
    println("user age download")
    return userAge
}