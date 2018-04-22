package com.example.mahmoud.kotlin_book

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Foundation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foundation)

        // var title =" android developer"
        //title =77 error

        //var result = sum(20,28)

//        var pair = Pair("height",2000)
//        println(pair)

//        var pair = "height" to 2000
//        println(pair)


        //map<String,Any>
//        var map  = mapOf("cairo" to "egypt","height0" to 333)
//
//        var age:Short =20 //short
//        var length = 1222L //long
//        var length2:Long = 2222


        //not null assertion
        // we use !! operator if we are sure that we have value
//        var name:String? = "ahmed"
//        println(name!!.length)

        //explict casting
//        var i:Int =12
//        var l:Long= i.toLong()
//
//        //arrays
//        val arr = arrayOf(1,2,3)
//        println(arr)
//        // define the size of array
//        val  arr2 = arrayOfNulls<Int>(3)
//        println(arr2)


        //string common operations
//  var str="eng.mahmoudramdan2012@GMAIL.COM"
//        println(str.reversed())
//        println(str.startsWith("@"))
//        println(str.substringBefore("@"))
//        println()


//        val name = "mahmoud"
//        val age = 28
//        println("my name is $name and my age is $age")

        //showSteprange()
        //showIf()
//        showWhen(100)
//        showWhen(80)

//        showWhenString("car")
//        showWhenString("Bike")
//        val x = 20
//        val m = when (x) {
//            in 1..10 -> "negligable risk"
//            !in 10..33 -> "major risk"
//            else -> "empty"
//        }
//        println(m)

        //showFor()
        //
        // showshowForIndices()
        showForIndexVal()
    }

    fun showForIndexVal(){
        var array = arrayOf(23,45,6)
        for ((index, value) in array.withIndex()) {
            println("Element at $index is $value")
        }

    }

    fun showFor(){
        var arr = arrayOf(1,3,45)
        for (item in arr)
            println(item)
    }

    fun showForIndices(){
        var arr = arrayOf(1,2,3)
        for(i in  arr.indices)
            println(arr[i])
    }


    fun showWhen(x: Int) {

        when (x) {
            10 -> println("x=10")
            80 -> println("x=80")
            else -> println("x is neither 10 or 80")
        }
    }


    fun showWhenString(vehicle: String) {
        val msg = when (vehicle) {
            "car" -> {
                "4 wheels"
            }
            "plane" -> {
                "2 wheels"
            }
            else -> {
                "no wheels"
            }
        }
        println(msg)
    }

    fun showIf() {
        val x = 90
        if (x > 10)
            println("greater")
        else
            println("smaller")

    }

    fun showSteprange() {
        for (i in 1..6 step 2)
            println("testing$i")
    }

    fun showReverseRange() {
        for (i in 4 downTo 1)
            println("testing$i")
    }

    fun showRange() {
        var weight = 52
        var healthy = 50..70
        if (weight in healthy)
            println("$weight is healthy")
    }

    fun showAny() {
        //Any is like Object in java
        var title: Any = "Ahmed"
        title = 45
    }

    fun shoeElvisOperator() {
        //elvis operator
        var x: Int? = null
        val v = x ?: 23
        println(v)

        //
    }

    fun sum(a: Int, b: Int) = a + b

    fun showVar() {
        //var is mutable
        var fruit: String = "banana"
        fruit = "Orange"
    }

    fun showVal() {
        //val is immutable and thread safe
        val fruit = "orange"
        // fruit = "baanan"  error
    }

    fun showOPtional() {
        //null reference
        var str: String? = null
        str?.toUpperCase()
        // non null reference
        // var x:Int = null //error
        var x: Int? = null
        val v = x ?: 23


    }
}
