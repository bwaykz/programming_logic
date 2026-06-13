algoritmo "Nome do Programa"

var

i, x, y : inteiro

vet : vetor [0..9] de inteiro

inicio

  escreval("**********************")
  escreval("* Prograna Negativos *")
  escreval("**********************")

  escreval(" ")

  escreval("Quantos numeros voce vai digitar: ")
  leia(x)

  para i de 0 ate x-1 faca
    escreval("Digite um numero")
    leia(y)

    vet[i] <- y 
  fimpara

  escreval(" ")

  escreval("numeros negativos: ")
  
  escreval("")
  
  para i de 0 ate x-1 faca
    se (vet[i] < 0) entao
      escreval(vet[i])
    fimse
  fimpara



fimalgoritmo
