algoritmo "Multiplos"

var

  n1, n2 : inteiro


inicio

  escreval("**********************")
  escreval("* Programa Multiplos *")
  escreval("**********************")

  escreval(" ")

  escreval("Digite o primeiro numero: ")
  leia(n1)

  escreval("Digite o segundo numero: ")
  leia(n2)


  escreval(" ")

  se (n1 % n2 = 0 ) ou ( n2 % n1 = 0) entao
    escreval("Sao Multiplos")
  senao
    escreval("Nao sao Multiplos")
  fimse

fimalgoritmo
