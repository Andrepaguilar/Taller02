package Taller02

fun main() {
    print ("Ingrese el numero 1: ")
    val numero_1 = readLine()!!.toInt()
    print ("Ingrese el numero 2: ")
    val numero_2 = readLine()!!.toInt()
    print("Digite operador numerico:")
    var Calculadora = readLine()!!.toString().lowercase()
    println("El Resultado es $Calculadora  : ${Cal(Calculadora,numero_1,numero_2)}")

}
fun Cal(x:String,numero_1: Int,numero_2: Int):Any{
    val operador: Any =when(x){
        "+"->numero_1+numero_2
        "-"->numero_1-numero_2
        "/"->numero_1/numero_2
        "*"->numero_1*numero_2
        "%"->numero_1%numero_2
        else-> "Entrada invalida"

    }
    return operador
}