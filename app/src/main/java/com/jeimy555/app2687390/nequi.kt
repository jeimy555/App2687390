package com.jeimy555.app2687390

class nequi {
}
fun iniciarSesion(tel:Long,con:Int):Boolean {
    var tele = 3005502758
    var cont = 5005
    var op = 1
    var intentos = 0

    if (tel == tele && con == cont) {
        return true;
    } else {
        println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes tres intentos más")
        intentos = intentos + 1
        do {


            println("ingresa tu numero de telefono")
            var tel = readLine()!!.toLong()
            println("_________________________________")
            println("ingresa tu contraseña")
            var con = readLine()!!.toInt()

            if (tel == tele && con == cont) {
                return true;
                op = 2
            } else if (intentos == 1) {
                println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes dos intentos más")
                op = 1
                intentos = intentos + 1
            } else if (intentos == 2) {
                println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes un intentos más")
                op = 1
                intentos = intentos + 1
            } else if (intentos == 3) {
                println("¡Upps! Parece que tus datos de acceso no son correctos")
                println("TU CUENTA AH SIDO BLOQUEADA")
                break
                op = 2
                return false
            }

        } while (op == 1)


    }
    return false;
}

fun saca(retiro: Int,saldo: Int):Int{
    if (saldo<2000 || retiro<saldo){
        println("lo lamentamos su saldo es insuficiente debe ser mayor o igual a 2000")
return 0
    } else if(saldo>=2000){
        println("retiro exitoso")
        return retiro
    }
    return 0;
}
fun envia(envia:Int,saldo: Int):Int{


    if (envia<=saldo){
        println("Envio exitoso")
        return envia
    } else {
        println("no es posible enviar el dinero por falta de saldo")
return 0
    }
    return saldo;
}

fun main() {
var op=0
    var saldo=4500
    println("_________________________________")
    println("BIENVENIDO A NEQUI")
    println("_________________________________")
    println("ingresa tu numero de telefono")
    var tel= readLine()!!.toLong()
    println("_________________________________")
    println("ingresa tu contraseña")
    var con= readLine()!!.toInt()

    if (iniciarSesion(tel,con)==true){
        println("Bienvenid@ jeimy")}
    println("_________________________________")

    println(" _   _ ______ ____   _    _ _____ ")
    println("| \\ | |  ____/ __  | |  | |_   _|")
    println("|  \\| | |__ | |  | | |  | | | | ")
    println("|      |  __|| |  | | |  | | | |  ")
    println("| |\\  | |___| |__| | |__| |_| |_ ")
    println("|_| \\_|_____|______|______|_____|")

    do {println("que proceso desea realizar el dia de hoy")
        println("1. sacar plata")
        println("2. envia plata")
        println("3. recarga plata")
        println("4. ver saldo")
        println("4. salir ")
        println("elija su opcion:")
        op= readLine()!!.toInt()
        if (op==1){
            println("cuanto desea retirar")
            var retiro= readLine()!!.toInt()
            saldo=saldo-saca(retiro,saldo)

        }else if(op==2){

        }else if(op==3){

        }else if (op==4){
println("su saldo es $saldo")
        }else if (op==5){
            println("a que numero desea enviar el dinero")
            var num= readLine()!!.toInt()
            println("cuanto desea enviar")
            var envio= readLine()!!.toInt()
            saldo=saldo-saca(envio,saldo)

        }
        println("desea realizar otro proceso 1 si 2 no")
        var op2= readLine()!!.toInt()
    }while (op2==1)


}