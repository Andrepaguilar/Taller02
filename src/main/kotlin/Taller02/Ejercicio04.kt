package Taller02

fun calcularsueldo(sueldo:Double):Triple<Double, Double,Double>{

    val arriendo=sueldo*0.4
    val comida=sueldo*0.15
    val sueldorestante=sueldo-arriendo-comida
    return Triple(arriendo,comida,sueldorestante)
}

fun main(){
    println("Ingrese el sueldo por favor")
    val sueldo= readln().toDouble()
    println("Valor gastado en arriendo ${calcularsueldo(sueldo).first}")
    println("Valor gastado en alimentación ${calcularsueldo(sueldo).second}")
    println("Tu sueldo final con gastos es: ${calcularsueldo(sueldo).third}")
}