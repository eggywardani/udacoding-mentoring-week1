package com.eggy


fun main() {

    val nilai = showValue(70.0, 80.0)
    println(nilai)
}


fun showValue(nilai1:Double, nilai2: Double):String = """
    Nilai 1 : $nilai1
    Nilai 2 : $nilai2
""".trimIndent()