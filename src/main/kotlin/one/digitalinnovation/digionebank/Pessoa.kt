package one.digitalinnovation.digionebank

class Pessoa {
    var name:String = "Marcelo"
    var cpf: String = "123.123.123-12"

}

fun main(){
    val marcelo = Pessoa()

    println(marcelo.name)
    println(marcelo.cpf)
}