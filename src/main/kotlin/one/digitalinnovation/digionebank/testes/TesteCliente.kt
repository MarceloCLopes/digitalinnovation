package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        name = "José da Silva",
        cpf = "546.987.123-55",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}