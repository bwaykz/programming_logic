algoritmo "Lanchonete"

var

x, uni : inteiro
pagar : real


inicio

  escreval("***********************")
  escreval("* Programa Lanchonete *")
  escreval("***********************")

  escreval(" ")

  escreval("Digite o codigo do produto comprado: ")
  leia(x)

  escreval("Digite quantas unidades foram compradas: ")
  leia(uni)

  escreval(" ")


  escolha x
  caso 1 
    pagar <- 5 * uni
  caso 2 
    pagar <- 3.50 * uni
  caso 3 
    pagar <- 4.80 * uni
  caso 4
    pagar <- 8.90 * uni
  caso 5
    pagar <- 7.32 * uni
  fimescolha

  escreval("**************************")
  escreval("Valor a pagar R$: ", pagar )
  escreval("**************************")

fimalgoritmo
