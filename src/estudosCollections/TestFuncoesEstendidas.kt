package estudosCollections

fun main() {
    val salarios = arrayOf("2000".toBigDecimal(), "1500".toBigDecimal(), "4000".toBigDecimal())
    //se alterar qualquer valor acima pra algum diferente de bigDecimal as funções não serão estendidas

    espaco()
    println(salarios.somatoria())

    espaco()
    println(salarios.media())
}