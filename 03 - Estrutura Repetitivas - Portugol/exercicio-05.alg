algoritmo "soma"

var

x, soma : inteiro

inicio
  soma <- 0

  escreval("****************************")
  escreval("* Programa para fazer soma *")
  escreval("****************************")

  escreval(" ")
  
  escreval("Digite 1 para começar: ")
  leia(x)

  enquanto (x <> 0) faca
    escreval("Digite um numero: ")
    leia(x)
    soma <- x + soma
  fimenquanto

  escreval(" ")

  escreval("soma = ", soma)


fimalgoritmo
