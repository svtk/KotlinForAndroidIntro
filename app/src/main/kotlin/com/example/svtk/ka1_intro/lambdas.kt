package com.example.svtk.ka1_intro


fun testLambdas() {

    val sum = { (x: Int, y: Int) -> x + y }

    val three = sum(1, 2)


    fun apply(i: Int, f: (Int) -> Int) = f(i)

    apply(2, { x -> x + 25 })

    //you can omit round brackets if lambda is the last argument
    apply(2) { x -> x + 25 }
}

