algoritmo "Mais_Velho"

var

x, i, velho : inteiro
name : caractere
nome : vetor [0..9] de caractere
idade : vetor [0..9] de inteiro

inicio

  escreval("***********************")
  escreval("* Programa mais velho *")
  escreval("***********************")

  escreval(" ")

  escreval("Quantas pessoas voce vai digitar? ")
  leia(x)

  escreval(" ")

  para i de 0 ate x-1 faca 
    escreval("Dados da ", i, "a pessoa: ")
    escreval("Nome: ")
    leia(nome[i])
    escreval("idade: ")
    leia(idade[i])
    
    se idade[i] > velho entao
      name <- nome[i]
      velho <- idade[i]
    fimse
  fimpara

  escreval(" ")

  escreval("A pessoa mais velha e ", name)



fimalgoritmo
