package com.example.mahmoud.kotlin_book

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var name =" Mahmoud Ramadan"
//        name = "reem"
//        Log.d("Name","name:${name.toUpperCase()}")
//
//        var myage:Int? =28
//        myage = null

        //range
//        for (i in 1..10)
//          Log.d("count",i.toString());


//        showMap()
//        //this code will work m
//        supportMarshmallo { println("hello Marshmallo") }
//
//        println("single instruction function")
//        println(add(20,5))

//        showDefaultParams("beach")
//        showDefaultParams("beach",20)
//        showDefaultParams("beach",39,"john")
//        showDefaultParams("beach",name="Ahmed")

        //playground with data model class
        var ball = Ball(20, "red")
        printModleClass(ball)
        makeCopyOfModelObject(ball)
        //scope
        println(ball)
        println(makeCopyOfModelObject(ball))


    }


    fun printModleClass(ball: Ball) = println(ball)

    fun makeCopyOfModelObject(ball:Ball) = ball.copy(size =2333)

    fun add(a: Int, b: Int) = a + b

    fun doSomething() {
        print("Hello Kotlin")
    }

    fun showForeach() {
        var cap = listOf("cairo" to "Egypt", "Mosco" to "Russia")
        cap.forEach { (capital, city) -> println("capital of $capital is $city") }
    }

    fun showForin() {
        var pairlist = listOf("poland" to "Warsaw", "cairo" to "Egypt")
        for ((caital, city) in pairlist)
            println("caital of $caital is $city")
    }

    fun showPair() {
        // pair
        var cap = "England" to "London"
        println(cap.first)
        println(cap.second)

        var (capital, city) = "Paris" to "France"
        println(capital)
        println(city)
    }

    fun showMutableList() {
        //can change collection state after initialization
        var mlist = mutableListOf(1, 2, 3, 4)
        mlist.add(5)
        mlist.add(6)
        mlist.forEach { println("mlist:$it") }
    }

    fun showImutableList() {
        var list = listOf(1, 2, 3, 4)
        //list.add() can not change collection state after init
    }

    fun showMap() {
        var cap = listOf("cairo" to "Egypt", "Mosco" to "Russia")
        var text = cap.map { (capital, _) -> capital.toUpperCase() }
                .onEach { println(it) }
                .filter { it.startsWith("C") }
                .joinToString(prefix = "capitals prefix:")

        println(text)
    }

    inline fun supportMarshmallo(code: () -> Unit) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            code()
        }
    }

    fun showDefaultParams(product: String, amount: Int = 10, name: String = "Anonymous") {
        println("$name has $amount of $product")
    }
}
