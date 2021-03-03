package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista(name = "Joao Claro Lopes", cpf = "12345678910", 2000.00)

   ImprimeRelatorioFuncionario.imprime(joao)

}

