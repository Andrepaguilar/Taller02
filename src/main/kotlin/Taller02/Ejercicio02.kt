package Taller02



fun buses(estudiantes_gordos:Int, estudiantes_flacos:Int, sillas:Int):Int{
    val buses= Math.ceil(((estudiantes_gordos*2+estudiantes_flacos)/sillas).toDouble())
    return buses.toInt()



}

fun main(){
    println("Ingrese los estudiantes gordos")
    val estudiantes_gordos= readln().toInt()
    println("Ingrese los estudiantes flacos")
    val estudiantes_flacos= readln().toInt()
    println("Ingrese el numero de sillas")
    val sillas= readln().toInt()
    val bu= buses(estudiantes_gordos,estudiantes_flacos,sillas)
    println ("El número de buses es: ${bu}")
}