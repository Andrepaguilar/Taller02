package Taller02

import kotlin.math.ceil

fun ocupacion(estudiantes:Int,capacidad_salon:Int,salones_piso:Int):Pair<Int,Int>{

    var num_salones = ceil(estudiantes.toDouble()/capacidad_salon).toInt()
    var num_pisos = ceil(num_salones.toDouble()/salones_piso).toInt()

    return Pair(num_salones,num_pisos)

}


fun main (){

    println("Por favor ingrese la cantidad de estudiantes que tendrá el nuevo edificio")
    var estudiantes = readln()!!.toInt()
    println("Cúal será la capacidad de estudiantes por salón?")
    var capacidad_salon = readln()!!.toInt()
    println("Cuántos salones habrán por piso?")
    var salones_piso = readln()!!.toInt()
    println("En total deberás construir ${ocupacion(estudiantes, capacidad_salon , salones_piso ).first} salones, los cuales, estarán distribuidos en ${ocupacion(estudiantes, capacidad_salon , salones_piso ).second} pisos")

}