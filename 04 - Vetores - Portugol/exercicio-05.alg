algoritmo "Nome do Programa" 
var

x, i, pares : inteiro

numer: vetor [0..9] de inteiro


inicio

  escreval("***************************")
  escreval("* Programas numeros pares *")
  escreval("***************************")

  escreval(" ")

  escreval("Quantos números você vai digitar? ")
  leia(x)

  escreval(" ")

  para i de 0 ate x-1 faca
    escreval("Digite um numero: ")
    leia(numer[i])
  fimpara

  escreval(" ")

  pares <- 0

  escreval("Números pares: ")
  para i de 0 ate x-1 faca
    se (numer[i] % 2 = 0) entao
      escreva(numer[i], " ")
      pares <- pares + 1
    fimse
  fimpara

  escreval(" ")

  escreval("Quantidade de pares: ", pares)

fimalgoritmo
