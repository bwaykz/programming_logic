algoritmo "Nome do Programa"

var

n1, n2, nf: real

inicio

  escreval("*************************************")
  escreval("* Programa Para Aprovar ou reprovar *")
  escreval("*************************************")

  escreval(" ")

  escreval("Digite a primeira nota: ")
  leia(n1)

  escreval("Digite a segunda nota: ")
  leia(n2)

  nf <- n1 + n2

  escreval(" ")

  se (nf > 60) entao
    escreval("**********************")
    escreval(" Nota final = ", nf)
    escreval(" Aprovado!")
    escreval("**********************")
  senao
    escreval("**********************")
    escreval(" Nota final = ", nf)
    escreval(" Reprovado!")
    escreval("**********************")
  fimse

fimalgoritmo
