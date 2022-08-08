package Taller02

fun Pequeña1 (Edad1: Int, Edad2:Int): Int {
    if (Edad1>Edad2) {
    }
    return Edad1
}
fun Pequeña2 (Edad1: Int, Edad3:Int): Int {
    if (Edad3>Edad1){
    }
    return Edad3
}
fun Pequeña3 (Edad2: Int, Edad3:Int): Int {
    if (Edad2>Edad3){
    }
    return Edad2
}


fun main(){

    print("Ingrese el nombre de la primer persona : ")
    val Nombre1= readln()!!.toString()
    print("Ingrese la edad de la primera persona : ")
    val Edad1 = readln()!!.toInt()

    print("Ingrese el nombre de la segunda persona : ")
    val Nombre2= readln()!!.toString()
    print("Ingrese la edad de la segunda persona : ")
    val Edad2  = readln()!!.toInt()

    print("Ingrese el nombre de la tercera persona : ")
    val Nombre3= readln()!!.toString()
    print("Ingrese la edad de la tercera persona : ")
    val Edad3 = readln()!!.toInt()

    val  P1= Pequeña1(Edad1,Edad2)
    print (" La persona más grande es: " + Nombre1)

    val  P2= Pequeña2(Edad3,Edad1)
    print (" La persona mediana es: " + Nombre2)

    val  P3= Pequeña3(Edad2,Edad3)
    print (" La persona más pequeña es: " + Nombre3)

}