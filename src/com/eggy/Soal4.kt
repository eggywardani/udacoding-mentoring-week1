package com.eggy

fun main() {
    checkNilai(61)
    checkNilai(81)
    checkNilai(95)
    checkNilai(10)
    checkNilai(120)

}


fun checkNilai(nilai:Int){
    when{
        nilai in 60..80 -> println("Memuaskan")
        nilai in 81..90 -> println("Sangat memuaskan")
        nilai in 91..100 -> println("Terpuji")
        nilai < 60 -> println("Tidak Lulus")
        nilai > 100 -> println("Nilai Tidak Valid")
    }

}