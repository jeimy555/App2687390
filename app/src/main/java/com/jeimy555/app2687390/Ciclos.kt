package com.jeimy555.app2687390

class Ciclos {
}

fun main() {
    /* for (i in 1..5) println(i)
    for (i in 5 downTo 0) println(i)
    for (i in 3..6 step 2) println(i)
    for (i in 'd'..'g') println(i)*/
    var pares: Int = 0
    var impares: Int = 0
    var cont1: Int = 0
    var cont2: Int = 0
var op:Int=0
    do {
        println("ingresa un numero")
        var num = readln()!!.toInt()
        if (num <= 0) {
            break

        } else {
            if ((num % 2) != 0) {

                cont1 = cont1 + 1
                impares = impares + num

            } else if ((num % 2) == 0) {

                cont2 = cont2 + 1
                pares = pares + num
            }


            println("desea ingresar otro numero? 1 si 2 no")
            op= readLine()!!.toInt()

        }} while (op == 1)


            println("el usuario ingreso $cont1 numeros impares y $cont2 numeros impares")
        println("el resultado de la suma de los pares es $pares")
        println("el resultado de la suma de los impares es $impares")

}