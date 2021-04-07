package estudosCollections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it) }

    espaco()
    println(funcionarios.find { it.nome == "Maria" })

    espaco()
    funcionarios.sortedBy { it.salario }.forEach{ println(it) }

    espaco()
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
)

{
    override fun toString(): String = """
        Nome:    $nome
        Salário: $salario
    """.trimIndent()
}

