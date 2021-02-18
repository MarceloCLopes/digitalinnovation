package one.digitalinnovation.digionebank

class Pessoa {
    var name:String = "Marcelo"
    var cpf: String = "123.123.123-12"
    private set

    constructor()

    fun pessoaInfo() = "$name e $cpf"
}

fun main(){
    val marcelo = Pessoa()
    //marcelo.cpf = "5469"

    println(marcelo.pessoaInfo())
}