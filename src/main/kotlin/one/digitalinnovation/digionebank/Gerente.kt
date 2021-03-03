package one.digitalinnovation.digionebank

class Gerente(
    name: String,
    cpf: String,
    salario: Double,
    val senha: String

) : Funcionario(name, cpf, salario), Logavel {
    override fun calculoAuxilio() = salario * 0.4

    override fun login(): Boolean = "senha123" == senha
}