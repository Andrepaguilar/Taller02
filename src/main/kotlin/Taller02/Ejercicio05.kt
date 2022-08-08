package Taller02

import kotlin.math.PI

fun areaG(area_mayor:Double):Double{

    return PI*Math.pow(area_mayor,2.0)
}

fun area_final(area_mayor:Double,area_menor:Double):Double{
    return areaG(area_mayor)-(PI*Math.pow(area_menor,2.0))
}

//Programa

fun main(){

    print("Ingrese el radio más grande del circulo:")
    var area_mayor = readLine()!!.toDouble()
    print("Ingrese el radio más pequeño del circulo:")
    var area_menor = readLine()!!.toDouble()
    println("El area de la corona circular verde es "+ area_final(area_mayor,area_menor))
            //" de: ${area_final(area_mayor,area_mayor)}")


}