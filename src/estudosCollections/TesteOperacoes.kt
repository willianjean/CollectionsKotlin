package estudosCollections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    espaco()
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Media salarial: ${salarios.average()}")

    espaco()
    val salariosMaiorQue2000 = salarios.filter { it > 2000.0 }
    salariosMaiorQue2000.forEach{ println(it) }
}