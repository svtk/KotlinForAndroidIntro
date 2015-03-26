package com.example.svtk.ka1_intro


fun testLambdas() {

    val sum: (Int, Int) -> Int = { (x: Int, y: Int) -> x + y }

    sum(1, 2) == 3 //true


    fun apply(i: Int, f: (Int) -> Int) = f(i)

    apply(2, { x -> x + 25 })

    //you can omit round brackets if lambda is the last argument
    apply(2) { x -> x + 25 }

    val predicate: (Int) -> Boolean = { x: Int -> x > 0 }

    val list = listOf(1, -1, 2)

    list.filter(predicate)

    list.filter { it > 0 }

    list.map { "$it" }
}

