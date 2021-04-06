package estudosCollections

fun espaco ():Unit{
    println("----------------------------")
}

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values){
        println(valor)
    }

    espaco()
    values.forEach { valor ->
        println(valor)
    }

    espaco()
    for(index in values.indices){
        println(values[index])
    }

    espaco()
    values.sort()
    for (valor in values){
        println(valor)
    }
}