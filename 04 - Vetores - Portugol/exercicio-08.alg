algoritmo "Nome do Programa"

var

x, i, contador: inteiro

vet : vetor [0..9] de real
media : real 
vetA : vetor [0..9] de real

soma : real

inicio

  escreval("************************")
  escreval("* Programa vetor media *")
  escreval("************************")

  escreval(" ")

  escreval("Quantos elementos vai ter o vetor: ")
  leia(x)

  contador <-0

  para i de 0 ate x-1 faca
    escreval("Digite um numero: ")
    leia(vet[i])
    se (vet[i] > 10) entao
      vetA[i] <- vet[i]
      contador <- contador + 1
    fimse
  fimpara

  soma <- 0

  para i de 0 ate x-1 faca
    soma <- soma + vetA[i]
  fimpara

  media <- soma / contador

  escreval(" ")

  escreval("A media do vetor = ", media)






fimalgoritmo
