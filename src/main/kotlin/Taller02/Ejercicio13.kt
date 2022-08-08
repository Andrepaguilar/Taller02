package Taller02

fun aumento_10 (salario8: Int): Int {
    if (salario8<=800000) {
        return (salario8+(salario8*10)/100)
    }else if(salario8<=1200000){
        return (salario8+(salario8*8)/100)
    }else if (salario8>1200000){
        return (salario8+(salario8*5)/100)
    }
    return 0
}

fun main() {

    print("Ingrese el salario : ")
    val salario8 = readln()!!.toInt()
    println(aumento_10(salario8))
}