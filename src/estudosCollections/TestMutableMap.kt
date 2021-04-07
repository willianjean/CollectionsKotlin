package estudosCollections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorioMutableMapOf = RepositorioMutableMapOf<Funcionario>()

    repositorioMutableMapOf.create(joao.nome, joao)
    repositorioMutableMapOf.create(pedro.nome, pedro)
    repositorioMutableMapOf.create(maria.nome, maria)

    println(repositorioMutableMapOf.findById(maria.nome))

    espaco()
    repositorioMutableMapOf.findAll().forEach{ println(it) }

    espaco()
    repositorioMutableMapOf.remove(maria.nome)
    repositorioMutableMapOf.findAll().forEach{ println(it) }
}