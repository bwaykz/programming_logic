algoritmo "Nome do Programa"

var
x, i : inteiro
vet : vetor [0..9] de real

soma, media, y : real

inicio

  escreval("***********************")
  escreval("* Programa Soma vetor *")
  escreval("***********************")

  escreval(" ")

  escreval("Quantos numeros você vai digitar: ")
  leia(x)
  
  para i de 0 ate x-1 faca
    escreval("Digite um numero: ")
    leia(y)

    vet[i] <- y
  fimpara

  escreval(" ")

  escreva("Valores = ")
  
  para i de 0 ate x-1 faca
    escreva(vet[i], " ")
  fimpara
  
  escreval(" ")

  para i de 0 ate x-1 faca
    soma <- soma + vet[i]
  fimpara
  
  escreval("Soma = ", soma)
  media <- soma / 4 
  escreval("Media = ", media)

fimalgoritmo
