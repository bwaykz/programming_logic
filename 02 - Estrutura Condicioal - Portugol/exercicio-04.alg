algoritmo "Operadora"

var

min, pagar, base : real
ope : real

inicio
  base <- 100
  ope <- 50

  escreval("**********************")
  escreval("* Programa Operadora *")
  escreval("**********************")

  escreval(" ")

  escreval("Digite a quantidade de minutos: ")
  leia(min)

  escreval(" ")

  se (min > base) entao
    pagar <- (min - base) * 2 + ope
    escreval("*************************")
    escreval(" valor a pagar: ", pagar:2:2)
    escreval("*************************")
  senao
    escreval("*************************")
    escreval("valor a pagar: ", ope:2:2)
    escreval("*************************")
  fimse



fimalgoritmo
