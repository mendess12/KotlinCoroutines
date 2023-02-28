package com.example.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Scope -> (Kapsam) Coroutine nerede calisacagini ve yasam dongusunu belirler

        //ic ice coroutine
     /*   runBlocking {
            launch {
                delay(5000)
                println("Run Blocking")
            }
            coroutineScope {
                launch {
                    delay(3000)
                    println("Coroutine Scope")
                }
            }
        }*/

        //Dispatchers.Main
        runBlocking {
            //Dispatchers.Main -> UI (kullanici arayuzu islemlerinde kullanilir)
            launch(Dispatchers.Main) {
                println("Main Thread : ${Thread.currentThread().name}")
            }
        }

    }
}