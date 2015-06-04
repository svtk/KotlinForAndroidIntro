package com.example.svtk.ka1_intro

fun foo1(): String = ""
fun foo2(): String? = null

fun testNullability() {
    val s1: String = "always not null"
    val s2: String? = null

    val i1: Int = s1.length()

    val i2: Int? = s2?.length()

    val i3: Int = s2?.length() ?: 0

    s2!! //throws NPE if s2 is null

    if (s2 == null) fail()
    s2.length()
}