package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "José"

    println("""""""""""""""""""""")
    for (nome in nomes){
        println(nome)
    }
    println("""""""""""""""""""""")
    nomes.sort()
    nomes.forEach { println(it) }

    println("""""""""""""""""""""")
    val nomes2 = arrayOf("Maria", "José", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }


}