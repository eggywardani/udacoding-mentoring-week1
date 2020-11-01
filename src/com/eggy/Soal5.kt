package com.eggy

fun main() {
    val arrayKota = arrayOf("Jakarta","Jakarta","Padang","Solo","Padang","Bandung","Padang","Malang","Bali")

    println("Jakarta : ${arrayKota.count { it == "Jakarta" }}")
    println("Padang : ${arrayKota.count { it == "Padang" }}")
    println("Solo : ${arrayKota.count { it == "Solo" }}")
    println("Bandung : ${arrayKota.count { it == "Bandung" }}")
    println("Malang : ${arrayKota.count { it == "Malang" }}")
    println("Bali : ${arrayKota.count { it == "Bali" }}")


}


