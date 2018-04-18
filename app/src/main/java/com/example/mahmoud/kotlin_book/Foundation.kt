package com.example.mahmoud.kotlin_book

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Foundation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foundation)

       // var title =" android developer"
        //title =77 error

   var result = sum(20,28)

//        var pair = Pair("height",2000)
//        println(pair)

//        var pair = "height" to 2000
//        println(pair)


        //map<String,Any>
        var map  = mapOf("cairo" to "egypt","height0" to 333)

        var age:Short =20 //short
        var length = 1222L //long
        var length2:Long = 2222



    }
    fun showAny(){
        //Any is like Object in java
        var title:Any ="Ahmed"
        title = 45

    }

    fun sum(a:Int,b:Int) = a+b

    fun showVar(){
        //var is mutable
        var fruit:String ="banana"
        fruit = "Orange"
    }

    fun showVal(){
        //val is immutable and thread safe
        val fruit = "orange"
       // fruit = "baanan"  error
    }
}
