package com.eggy

fun main() {
    val arrayKota = arrayOf("Jakarta","Jakarta","Padang","Solo","Padang","Bandung","Padang","Malang","Bali")
    val arrayKotaList = arrayKota.toSet()


    for (i in arrayKotaList){
        println("$i : ${arrayKota.count { it == i }}")
    }

}


