package com.example.hometask_module_4
class FunctionsTask {
}

fun main(){
println(soma(5,5))
println(multiplicacao(5,5))
calculadora(5,5,::soma)
calculadora(5,5,::multiplicacao)

}

//Crie uma função que receba dois números inteiro de
//parâmetro e retorne o resultado da soma

fun soma(num1: Int, num2: Int): Int {
    return num1 + num2
}

// Crie uma função compacta que receba dois números inteiros
//de parâmetro e retorne o resultado da multiplicação deles
fun multiplicacao(numero1: Int, numero2:Int) = numero1 * numero2

//Crie uma função calculadora que recebe
//dois inteiros de parâmetro e um terceiro parâmetro do
//tipo função. Esta função de parâmetro deve receber dois
//inteiros de parâmetro e retornar um inteiro
//• Teste esta função passando dois inteiros e a função soma
//• Teste esta função passando os mesmos números inteiros do teste
//anterior mas passando a função multiplicação desta vez

fun calculadora(umInteiro: Int, doisInteiro:Int, terceiroFun:(Int,Int) ->Int){
   println(terceiroFun(umInteiro, doisInteiro))
}