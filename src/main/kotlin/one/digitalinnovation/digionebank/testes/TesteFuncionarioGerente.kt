package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente(name = "Maria Claro Lopes", cpf = "98765432100", 5000.00)

    ImprimeRelatorioFuncionario.imprime(maria)
}

