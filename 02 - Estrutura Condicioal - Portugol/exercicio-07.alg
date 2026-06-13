algoritmo "dardo"

var

  n1, n2, n3, maior : real

inicio

  escreval("******************")
  escreval("* Programa dardo *")
  escreval("******************")

  escreval(" ")

  escreval("Digite a primeira distancia: ")
  leia(n1)

  escreval("Digite a segunda distancia: ")
  leia(n2)

  escreval("Digite a terceira distancia: ")
  leia(n3)

  escreval(" ")

  se (n1 > n2) e (n1 > n3) entao
    maior <- n1
    escreval("Maior distancia: ", maior)
  senao
    se (n2 > n1) e (n2 > n3) entao
      maior <- n2
      escreval("Maior distancia: ", maior)
    senao
      maior <- n3
      escreval("Maior distancia: ", maior)
    fimse
  fimse

fimalgoritmo
