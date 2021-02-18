package one.digitalinnovation.digionebank

class Pessoa {
    var name:String = "Marcelo"
    var cpf: String = "123.123.123-12"
    private set
}

fun main(){
    val marcelo = Pessoa()
    //marcelo.cpf = "5469"

    println(marcelo)
    println(marcelo.name)
    println(marcelo.cpf)
}