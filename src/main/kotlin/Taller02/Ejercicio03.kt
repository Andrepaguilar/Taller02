package Taller02

import kotlin.math.sqrt

fun hipotenusa(x:Double, angulo:Double):Double{

    var longitud = x/Math.cos(angulo)

    return longitud

}


fun main(){

    println("Por favor ingrese el valor de x (altura de la escalera inclinada en la pared:)")
    var x = readln()!!.toDouble()
    println("Indica cual es el ángulo que genera la escalera con respecto al piso")
    var angulo = readln()!!.toDouble()

    println("La longitud de la escalera es de ${hipotenusa(x,angulo)}")

}