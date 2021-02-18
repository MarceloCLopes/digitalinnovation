package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco(name = "DigiOne", numero = 12)

    println(digiOneBank.name)
    println(digiOneBank.numero)
}