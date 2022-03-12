package com.example.hometask_module_4

class ListsFunctionsTask {
}

fun main(){
    //1 Crie uma lista com os números inteiro de 1 a 99

    val listaDeInteiros: List<Int> = (1..99).toList()
   // println(listaDeInteiros) Teste

//2 Utilizando esta lista crie um filtro que retorna uma lista
//com os números pares contidos na lista original

    val listaInteirosFilter = listaDeInteiros.filter { it%2==0 }
    //println(listaDeInteiros) Teste

    //3 Crie uma lista de string com 4 nomes
    val listaDeQuatroNomes: List<String> = listOf("Pedro", "Aulus", "Rodrigo", "Sandro")

    //4 Utilizando o operador map concatene a string "Olá "
//antes de cada nome
    //5 Percorra a lista modificada usando um forEach e imprima
//todos os seus valores
listaDeQuatroNomes.map { "Ola $it" }.forEach {
    println(it)
}


}



