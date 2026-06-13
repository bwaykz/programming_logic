algoritmo "menor de tres"

var

  n1, n2, n3, menor : inteiro


inicio

  escreval("****************************************")
  escreval("* Programa para mostrar o menor numero *")
  escreval("****************************************")

  escreval(" ")

  escreval("Digite o Primeiro número ")
  leia(n1)

  escreval("Digite o segundo numero: ")
  leia(n2)

  escreval("Digite o terceiro numero: ")
  leia(n3)

  escreval(" ")

  se (n1 < n2) e (n1 < n3) entao
    menor <- n1
    escreval("********************")
    escreval(" Menor = ", menor)
    escreval("********************")
  senao
    se(n2 < n1) e (n2 < n3) entao
      menor <- n2
      escreval("********************")
      escreval(" Menor = ", menor)
      escreval("********************")
    senao 
      menor <- n3
      escreval("********************")
      escreval(" Menor = ", menor)
      escreval("********************")
    fimse
  fimse



fimalgoritmo
