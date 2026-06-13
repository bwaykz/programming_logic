algoritmo "Multiplicaçao"

var

  n1, n2, multi : inteiro

inicio

  escreval("********************************************")
  escreval("* Programa para Multiplicaçao de 2 numeros *")
  escreval("********************************************")

  escreval(" ")

  escreval("Digite o primeiro numero: ")
  leia(n1)

  escreval("Você quer multiplicar ", n1, " Por quantos?", "(digite um numero)")
  leia(n2)

  multi <- n1 * n2

  escreval(" ")

  escreval("********************************************")
  escreval(" A multiplicaçao de ", n1, " por ", n2, " é = ", multi)
  escreval("********************************************")
fimalgoritmo
