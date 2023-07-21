package com.jeimy555.app2687390

class Reto3 {
}

fun main() {
    //variables
    var op: Int=0
    var op2: Int=0
    var op3: Int=0
    val autos= mutableListOf("ferrari")
    var nombre=""
    var posicion: Int=0


    println("bienvenido a consensionario si no se lo vendemos se lo metemos")
    println(autos.contains("ferrary"))

    do {
        println("---------------------------------------")
        println("que procedimiento desea realizar hoy")
        println("1 registrar auto")
        println("2 mostrar autos registrados")
        println("3 buscar auto")
        println("4 modificar auto")
        println("5 eliminar auto")
        println("6 borrar lista de autos")
        println("---------------------------------------")
        var op= readLine()!!.toInt()

        if (op==1){

         println("INGRESE EL NOMBRE DEL AUTO QUE DESEA REGISTRAR")
            nombre= readLine().toString()
            //validar si el auto ya esta registrado
            if (autos.contains(nombre)==false){
            autos.add(nombre)
                println("auto registrado Exitosamente")
            }
            else {
                println("el auto ya fue registrado")
            }
        } else if(op==2){

            println("los autos registrados son")
            //ciclo para mostrar los elementos de la lista o los autos registrados
            for ((index,element) in autos.withIndex()){
                println(" -$index $element")
            }

        } else if(op==3){

            println("ingrese el nombre del auto que desea buscar")
            nombre= readln()!!.toString()
            if (autos.contains(nombre)==true){
                println("el auto $nombre, si se encuentra en la lista")
            }else{
                println("el auto $nombre, no se encuentra en la lista")
            }

        }else if(op==4){
            println("la lista de autos es")
            println("---------------------------------------")
            for ((index,element) in autos.withIndex()){
                println(" -$index $element")
            }
            println("---------------------------------------")
            println("que auto desea modificar, ingrese la posicion")
            println("!!! TENGA EN CUENTA QUE LAS POSICIONES COMIENZAN DESDE 0")
            println("---------------------------------------")
            posicion= readLine()!!.toInt()
            println("ingrese el auto por el cual lo desea modificar")
            nombre= readLine().toString()
            if (autos.contains(nombre)==false){
                autos[posicion]=nombre
                println("---------------------------------------")
                println("auto fue modificado Exitosamente")
                println("---------------------------------------")
            }
            else {
                println("el auto ya esta registrado intente nuevamente con otro")
            }


        }else if (op==5){
            println("la lista de autos es")
            println("---------------------------------------")
            for ((index,element) in autos.withIndex()){

                println(" -$index $element")
            }
            println("---------------------------------------")
            println("tiene varias opciones para eliminar el auto que desea")
            println("1 por numero de posicion")
            println("2 por nombre")
            println("que opcion desea escoger?")
            op3= readLine()!!.toInt()

            if (op3==1){
                println("!!! TENGA EN CUENTA QUE LAS POSICIONES COMIENZAN DESDE 0")
                println("ingrese la posicion del auto a eliminar")
                posicion= readLine()!!.toInt()
                autos.removeAt(posicion)

            }else if(op==2){
                println("ingrese el nombre del auto a eliminar")
                nombre= readLine()!!.toString()
                autos.remove(nombre)
            } else{
                "eleccion no valida, intentelo de nuevo"
            }


        } else if(op==6){
            println("--------------------------------------------------")
            println("ESTA SEGURO QUE DESE ELIMINAR LA LISTA COMPLETA?")
            println("este procedimiento no es reversible")
            println("      1 si                 2 no")
            println("--------------------------------------------------")
            op3= readLine()!!.toInt()
            if (op3==1){
                autos.clear()
                println("lista eliminada :(")
            }else if (op3==2){
                println("la lista no fue eliminada :)")
            }else{
                "eleccion no valida, intentelo de nuevo"
            }
        }


        println("desea realizar otro proceso? 1 si 2 no")
        op2= readLine()!!.toInt()
    }while (op2==1)
}




