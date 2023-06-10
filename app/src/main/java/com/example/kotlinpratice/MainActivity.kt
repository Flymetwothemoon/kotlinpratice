package com.example.kotlinpratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.collections.mapOf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var two1 = two("1");
//        two1.eat()
//        val map = mapOf("Apple" to 1,"Banana" to 2)
//        for ((fruit,number)in map){
//
//            Log.d("TAG","fruit is"+fruit+"number is"+number)
//        }
//
//       Log.d("TAG",""+map) // 输出: {Apple=1, Banana=2, Orange=3}
        val list = listOf("banana","apple","orange","pear")
        val result = with(java.lang.StringBuilder()){
            append("start\n")
            for(fruit in list){
                append(fruit).append("\n")
            }
            append("end")

        }
        println(result.toString())
        val a1 = util.doSome()

        whatToDo()
        single.iwhat()
        println("abcdef".lettersCount())
        println(sm_0.smMethod("abc"))


        val money1 = Money(5)
        val money2 = Money(10)
        val money3 = money1+money2
        println(money3.value)


        val num1 = 180
        val num2 = 80
        val result1 = num1AndNum2(num1,num2){
            x,y->plus(x,y)
        }
        val result2 = num1AndNum2(num1,num2){
            x,y->minus(x,y)
        }
        println("result1 is $result1")
        println("result2 is $result2")


        val list1 = listOf("banana","apple","orange","pear")
        var UseWith = with(StringBuilder()){
            append("start\n")
            for(i in list1){
                append(i)
            }
            append("\n")
            append("end")
            toString()
        }
        println(UseWith)
    }
    fun plus(num1:Int,num2:Int):Int{
        return num1+num2
    }
    fun minus(num1:Int,num2:Int):Int{
        return num1-num2
    }

    fun num1AndNum2(num1:Int,num2:Int,operation:(Int,Int)->Int):Int{
        val result = operation(num1,num2)
        return result
    }


}