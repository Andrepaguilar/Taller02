package Taller02

fun dxy(x1:Double,y1:Double, x2:Double,y2:Double):Double{

    var distancia = Math.sqrt(Math.pow(y2-y1,2.0)+Math.pow(x2-x1,2.0))
    return distancia

}

fun pendiente(x1:Double,y1:Double, x2:Double,y2:Double):Double{

    var m = (y2-y1)/(x2-x1)
    return m

}

fun pmedio (x1:Double,y1:Double, x2:Double,y2:Double):Pair<Double,Double>{

    var xm = ((x1+x2)/2)
    var ym = ((y1+y2)/2)

    return Pair(xm,ym)
}

fun main(){

    println("Ingrese por favor el primer valor de la absisa o el valor en el eje X1:")
    var x1 = readln()!!.toDouble()

    println("Ingrese por favor el primer valor de la coordenada o el valor en el eje y1:")
    var y1 = readln()!!.toDouble()

    println("Ingrese por favor el segundo valor de la absisa o el valor en el eje X2:")
    var x2 = readln()!!.toDouble()

    println("Ingrese por favor el segundo valor de la ordenada o el valor en el eje y2:")
    var y2 = readln()!!.toDouble()

    println("La distancia entre los los dos puntos es de: ${dxy(x1,y1,x2,y2)}")
    println("La pendiente de la recta es : ${pendiente(x1,y1,x2,y2)}")
    println("El punto medio entre estos dos puntos es de: ${pmedio(x1,y1,x2,y2)}")

}