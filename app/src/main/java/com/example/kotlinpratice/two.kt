package com.example.kotlinpratice

import android.util.Log

class two(val sno:String) : LearnKotlin() {
    fun eat(){
        println("吃了")
        Log.d("TAG","吃了")
    }
    init {
        Log.d("TAG","1")
        println("你好")

    }


}