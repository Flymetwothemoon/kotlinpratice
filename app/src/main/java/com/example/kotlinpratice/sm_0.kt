package com.example.kotlinpratice

object sm_0 {
    fun smMethod(str:String):Int{
        var num = 0;
        for(char in str){
            if(char.isLetter()){
                num++
            }
        }
        return num
    }
}