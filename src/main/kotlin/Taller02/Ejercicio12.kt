package Taller02

fun main(){

    println("Ingrese el día de la semana")
    val x = readln()!!.toString().lowercase()
    println ("el día siguientes es: ${dia(x)}")
}


fun dia (x:String):String = when (x) {

        "lunes" -> "martes"
        "martes" -> "miercoles"
        "miercoles" -> "jueves"
        "jueves"-> "viernes"
        "viernes" -> "sabado"
        "sabado" -> "domingo"
        "domingo" -> "lunes"

        else -> {
            "No se ha ingresado una opción valida"
        }
    }




