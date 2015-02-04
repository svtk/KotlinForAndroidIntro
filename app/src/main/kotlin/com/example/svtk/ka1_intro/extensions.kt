package com.example.svtk.util

fun String.lastChar() = this.charAt(this.length() - 1)

//'this' can be omitted
fun String.lastChar1() = charAt(length() - 1)

fun use() {
    // lastChar() is visible in completion
    val c: Char = "abc".lastChar()
}

