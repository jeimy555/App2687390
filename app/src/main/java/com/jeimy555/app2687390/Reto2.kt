package com.jeimy555.app2687390

class Reto2 {

}

fun main() {
    var op: Int=1
    println("BIENVENIDO A SUPERMERCADOS NOE")
    while (op==1){
        println("ingrese el valor de su compra")
        var valorC= readln()!!.toInt()
        var bola=(1..4).random()

        if ( valorC>50000 && bola == 1) {
            println("ah sacado la bola roja, usted ah obtenido un 10% de descuento en su compra\n" +
                    "el valor de su compra ahora es ${valorC-(valorC*0.1)} pesos")
        }
        else if (valorC>50000 && bola == 2) {
            println("ah sacado la bola azul, usted ah obtenido un 30% de descuento en su compra\n" +
                    "el valor de su compra ahora es ${valorC-(valorC*0.3)} pesos")
        }
        else if (valorC>50000 && bola == 3) {
            println("ah sacado la bola amarilla, usted ah obtenido un 50% de descuento en su compra\n" +
                    "el valor de su compra ahora es ${valorC-(valorC*0.5)} pesos")
        }
        else if (valorC>50000 && bola == 4) {
            println("ah sacado la bola blanca, usted ah obtenido un 100% de descuento en su compra\n" +
                    "el valor de su compra ahora es ${valorC-(valorC*1)} pesos")
        }
        else {
            println("el valor de la compra es $valorC")
        }


        println("desea hacer otra compra? 1 si 2 no")
        op= readLine()!!.toInt()
    }
    println("GRACIAS POR PREFERIRNOS")

}
