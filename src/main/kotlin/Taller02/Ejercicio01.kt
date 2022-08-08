package Taller02

fun main(){

    println("Ingrese un valor para X")
    val x= readln().toDouble()
    println("Ingrese un valor para Y")
    val y= readln().toDouble()
    println("El resultado es: ${calcularxy(x,y)}")
}

fun calcularxy (x:Double, y:Double):Double{

    val resultado=(Math.pow(x,2.toDouble())-(2*x*y)+Math.pow(y,2.toDouble()))
    return resultado

}