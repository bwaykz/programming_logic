algoritmo "Alturas"

var

x, i : inteiro
nome : vetor [0..9] de caractere
idade : vetor [0..9] de inteiro
altura : vetor [0..9] de real
soma, media : real

inicio

  escreval("********************")
  escreval("* Programa Alturas *")
  escreval("********************")

  escreval(" ")

  escreval("Quantas pessoas serao digitadas: ")
  leia(x)

  para i de 1 ate x faca
    escreval("Dados da ", i, "a pessoa: ")
    escreval("Nome: ")
    leia(nome[i])
    escreval("idade: ")
    leia(idade[i])
    escreval("Altura: ")
    leia(altura[i])
  fimpara

  soma <- 0

  para i de 0 ate x-1 faca
    soma <- soma + idade[i]
  fimpara
  
  media <- soma / x 

  escreval("altura media: ", media)
  escreval("Pessoas com menos de 16 anos: ")

  para i de 0 ate x-1 faca
    se idade[i] < 16 entao
       escreval (nome[i])
    fimse
  fimpara


fimalgoritmo
