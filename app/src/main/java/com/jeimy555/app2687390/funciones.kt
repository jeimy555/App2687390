package com.jeimy555.app2687390

class funciones {
}

fun calcularP(){

    var radio=0
    print("ingrese el radio del circulo:")
    radio=readLine()!!.toInt()

    println("el perimetro de su circulo es ${2*radio*3.14}")
}
fun calcularA(){

    var radio=0
    print("ingrese el radio del circulo:")
    radio=readLine()!!.toInt()
    println("el area de su circulo es ${(radio*radio)*3.14}")
}
fun area(b: Int,a:Int){
    var valorT1=(b*a)/2
    println("el perimetro del triangulo es $valorT1")
}
fun perimetro(a:Int,b:Int,c:Int){
    var valorT=a+b+c
    println("el area del triangulo es $valorT")
}
fun tipo(l1:Int,l2:Int,l3:Int){
    if (l1==l2 && l2==l3){
        println("el triangulo es equilatero")
    }else if (l1==l2 || l1==l3 || l3==l2){
        println("el triangulo es isoceles")
    } else{
        println("el triangulo es escaleno")
    }
}
fun Pc(lado: Int,lado2: Int): Int {
    return (lado*2)+(lado2*2)!!
}
fun Ac(lado: Int,lado2: Int): Int{
    return lado*lado2!!
}

fun main() {
   /* val temperature=20
    val isHot=if(temperature>40)true else false
    println(isHot)
println("uwu")
    var edad= readLine()!!.toInt()
    val entra=if(edad>=18) println("bienvenido") else println("pa la casa")
    println(entra)
    Hello()*/
  var op=1
   var op2=0


do {

   println("bienvenido a nuestro sistema circular")
   println("desea:")
   println("1. averiguar el perimetro de un circulo")
   println("2. averiguar el area de un circulo")
    println("3. averiguar el perimetro de un triangulo")
    println("4. averiguar el area de un triangulo")
    println("5. averiguar el perimetro de un rectangulo")
    println("6. averiguar el area de un rectangulo")
   print("elija su opcion:")
   op2= readLine()!!.toInt()
   if (op2==1){
       calcularP()
   }else if (op2==2){
       calcularA()
   }else if(op2==3){
       println("ingrese el valor de los lados")
       print("lado1:")
       var l1= readLine()!!.toInt()
       print("lado2:")
       var l2= readLine()!!.toInt()
       print("lado3:")
       var l3= readLine()!!.toInt()
       perimetro(l1,l2,l3)
       tipo(l1,l2,l3)
   }else if(op2==4){
       println("ingrese la base y la altura")
       print("base:")
       var bas= readLine()!!.toInt()
       print("altura:")
       var alt= readLine()!!.toInt()
       area(bas,alt)
   }else if(op2==5){
       println("ingrese el valor de los lados")
       print("lado 1:")
       var l1= readLine()!!.toInt()
       print("lado 2:")
       var l2= readLine()!!.toInt()
       println("el perimetro del rectangulo es ${Pc(l1,l2)}")
   }else if(op2==6){
       println("ingrese el valor de los lados")
       print("lado 1:")
       var l1= readLine()!!.toInt()
       print("lado 2:")
       var l2= readLine()!!.toInt()
       println("el area del rectangulo es ${Ac(l1,l2)}")
   }
    else{
       println("opcion invalida")
       break
   }
   println("desea realizar otro proceso? 1 si 2 no")
   op= readLine()!!.toInt()

}while(op==1);




}