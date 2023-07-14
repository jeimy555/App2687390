package com.jeimy555.app2687390

class Condicionales {
}

fun main() {

   /* var op: Int=1

    while (op==1){
        println("ingresa un numero")
        var num1= readLine()!!.toInt()
        println("ingresa otro numero")
        var num2= readLine()!!.toInt()
    if (num1>num2) {
        println("el numero $num1 es mayor que el numero $num2")

    } else
    if(num2==num1){
        println("el numero $num1 es igual al numero $num2")
    }
    else{
        println("el numero $num2 es mayor que el numero $num1")
    }
    println("desea ingresar otros numeros? 1si 2no")
    op= readLine()!!.toInt()
}
    println("gracias por participar")

    // rangos
    var aleatorio=(1..20).random()
    println(aleatorio)
    //var aleatorio= readLine()!!.toInt()
    if (aleatorio in 1..20) {
        println("el numero esta en el rango")

    }else{
        println("te dije un numero del 1 al 20")
    }*/
    var results=(0..50).random()
println("el numero generado es $results")
    when(results){
        0 -> println("no hay coincidencias")
        in 1 .. 10 -> println("hay 10 coincidencias o menos")
        in 20..50 -> println("hay muchas coincidencias")

    }
}