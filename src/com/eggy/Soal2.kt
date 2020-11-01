package com.eggy


fun main() {
    val dataArray = 1..50
    val arrayList = dataArray.toList().toTypedArray()

    for (i in arrayList){
        if (i % 2 == 0) println("Nilai $i adalah bilangan Genap" )
    }
}
