package com.example.wdqwed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}

fun toStringNumb(count:Int):String
{
    return when(count)
    {
        in 0..<999 -> count.toString()
        in 1000..<1_000_000 -> ((count/100).toFloat()/10).toString()+"K"
        in 1_000_000..<1_000_000_000 -> ((count/100_000).toFloat()/10).toString() + "M"
        else -> "Более млрд"
        }
    }

