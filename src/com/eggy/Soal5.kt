package com.eggy

fun main() {
    val arrayKota = arrayOf("Jakarta","Jakarta","Padang","Solo","Padang","Bandung","Padang","Malang","Bali")


    for (i in arrayKota.toSet()){
        println("$i : ${arrayKota.count { it == i }}")
    }

}


