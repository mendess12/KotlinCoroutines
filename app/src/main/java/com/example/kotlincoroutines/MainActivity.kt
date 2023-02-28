package com.example.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness

        /*
        * repeat ->yapilacak islemin kaç defa yapilacagini ayarlar (tekrar sayisi)
        */
         GlobalScope.launch {
             repeat(100_000) {
                 launch {
                     println("Kotlin Coroutines")
                 }
             }
         }

        //Scope -> (Kapsam) Coroutine nerede calisacagini ve yasam dongusunu belirler

        //runBlocking -> Coroutine icin scope olusturur fakat bloke'layark olusturur
        println("Run Blocking start")
        runBlocking {
            launch {
                delay(5000)
                println("Run Blocking")
            }
        }
        println("Run Blocking end")

        //Global Scope -> Butun application icerisinde calistirabilecegimiz bir kapsamda acar
        println("Global Scope start")
        GlobalScope.launch {
            delay(5000)
            println("Global Scope")
        }
        println("Global Scope end")

        //Coroutine Scope -> Scope olusturur ve icindeki tum coroutine'ler bitene kadar calismaya devam eder
        //context -> Coroutine'lerin hangi verilerle calisacagini bildirir
        println("Coroutine Scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("Coroutine Scope")
        }
        println("Coroutine Scope end")

        //ic ice coroutine
        runBlocking {
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
        }

    }
}