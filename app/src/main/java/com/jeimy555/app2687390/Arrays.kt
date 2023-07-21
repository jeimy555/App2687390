package com.jeimy555.app2687390

class Arrays {
}

fun main() {
    /*val pets=arrayOf("dog","cat","canary")
    println(pets.contentToString())
    println(pets[1])
    pets[2]="parrot";
    println(pets[2])
    for (element in pets){
        println("la mascota es $element")
    }
    for ((index,element) in pets.withIndex()){
        println("la mascota es $element y su posicion es $index")
    }
    val instrument = listOf("trumpet","piano","violin")

    val instrumentos= mutableListOf("trumpet","piano","violin")
    println(instrument)
    println(instrumentos)
    println(instrument[1]);
    instrumentos[2]="guitarra";
    println(instrument)
    println(instrumentos)*/
    val instrumentos= mutableListOf("trumpet","piano","violin")
    //como obtener primero y ultimo elemento de una lista
    println(instrumentos.last())


    println(instrumentos.first())
    //como agregar elementos a la lista
    instrumentos.add("guitarra")
    instrumentos+="ukelele"
    println(instrumentos)
    //como quitar elementos de una lista mutable
    instrumentos.remove("violin")
    println(instrumentos)
    //como buscar elementos a una lsita mutable
    println(instrumentos.contains("guitarra"))
    //que pasa si quitas un elemento que no existe
    instrumentos.remove("uwu")
    //quitar elementos por medio de l index
    instrumentos.removeAt(1)
    println(instrumentos)
//como borrar la lista completa
    instrumentos.clear()
    println(instrumentos)
}