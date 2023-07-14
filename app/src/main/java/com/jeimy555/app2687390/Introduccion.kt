package com.jeimy555.app2687390

class Introduccion {
}

fun main() {
/*
//println imprime en un salto de linea
//print imprime en una sola linea
print("uwu uwu")
println("uwu uwuwuwuw"+"owo")
//val denomina una constante, no se puede redefinir
val name="jeimy"
//var es para crear variables que se pueden redefinir
var score=10
//especificar tipo de variable
var name2: String="jeimy alejandra"
//true=1 false=0
//los resultados operacionales son el mismo tipo de variable que los datos originales

*/

    val nombre: String="Jeimy Barbosa"
    var edad: Byte=18
    var peso: Double= 60.5
    var estado: Boolean=true
    val primeraLetraNombre: Char='J'
    var estatura: Float=1.60F
    val numeroIdentificacion: Int=1032677961
    val numeroRegistro: Long=1234567890123456789
    println("numero de registro: "+numeroRegistro)
    println("nombre: "+nombre)
    println("edad: "+edad)
    println("primera letra del nombre: "+primeraLetraNombre)
    println("peso: "+peso)

    if (estado == true) {
        println("estado: activo")
    }
    println("estatura: "+estatura)
    println("numero de identificacion: "+numeroIdentificacion)

    //ejercicio
    println("escriba su nombre")
    var nombre2= readLine()
    println("escriba su apellido")
    var apellido= readLine()
    println("escriba su edad")
    var edad2= readLine()!!.toInt()
    println("en 10 años $nombre2 $apellido tendra ${edad2+10} años")
}