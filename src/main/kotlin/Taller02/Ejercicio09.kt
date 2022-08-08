package Taller02

fun mayor_valor(entero1:Int,entero2:Int):Int{

    var mayor = 0

    if (entero1>entero2){

        mayor = entero1

    }else{
        mayor = entero2

    }

    return mayor

}

fun main(){

    println("Por favor ingrese el PRIMER entero que vas a comparar")
    var entero1 = readln()!!.toInt()
    println("Por favor ingrese el SEGUNDO entero que vas a comparar")
    var entero2 = readln()!!.toInt()
    println("De los dos números que has ingresado, el que tiene el mayor valor es ${mayor_valor(entero1,entero2)}")

}