package com.jeimy555.app2687390

class Reto1 {
}

fun main() {
    var op: Int=1

    while (op==1){
println("_____________________________________\n" +
        "BIENVENIDO AL JUEGO DE LOS DADOS \n" +
        "ganas si:\n" +
        "sacas un par de unos en los dados \n" +
        "sacas un total de tres en los dados\n" +
        "sacas un total de once en los dads \n" +
        "sacas dos o doce en los dados\n" +
        "sacas un total e siete en los dados\n" +
        "_____________________________________")
    var dado1=(1..6).random()
    var dado2=(1..6).random()

    if (dado1==1 && dado2==1){
        println("el dado uno es igual a $dado1 y el dado dos es igual a $dado2, USTED AH GANADO")
    }
    else if ( dado1+dado2==3 ) {
        println("el dado uno es igual a $dado1 y el dado dos es igual a $dado2, USTED AH GANADO")
    }
    else if ( dado1+dado2==11 ){
        println("el dado uno es igual a $dado1 y el dado dos es igual a $dado2, USTED AH GANADO")
    }
    else if (dado1+dado2==12 ){
        println("el dado uno es igual a $dado1 y el dado dos es igual a $dado2, USTED AH GANADO")
    }
    else if (dado1+dado2==7 ){
        println("el dado uno es igual a $dado1 y el dado dos es igual a $dado2, USTED AH GANADO")
    }
    else
    {
        println("el dado uno es igual a $dado1 y el dado dos es igual a $dado2,  USTED AH PERDIDO")
    }
        println("desea volver a jugar? 1 si 2 no")
    op= readLine()!!.toInt()

    }
    println("GRACIAS POR JUGAR")

}