package com.eggy


fun main() {
    val dataArray = arrayOf("udacoding","tempat 2","tempat 3","tempat 4" ,"tempat 5")

    arrayListString(dataArray)

}


fun arrayListString(listArray: Array<String>){
    for (i in listArray){
        if (i == "udacoding") println("$i : nah ini belajar coding yang keren")
        else println(i)
    }
}
