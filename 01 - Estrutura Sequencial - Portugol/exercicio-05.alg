algoritmo "troco"

var

pre, uni, din, troco: real

inicio

  escreval("***********************************")
  escreval("* Programa para qualcular o troco *")
  escreval("***********************************")
  
  escreval(" ")

  escreval("Digite o preço do produto: ")
  leia(pre)
  
  escreval("Digite quantas unidades: ")
  leia(uni)

  escreval("Digite quantos reais recenbeu do cliente: ")
  leia(din)

  troco <- abs((pre * uni) - din)
  
  escreval(" ")

  escreval("***********************************")
  escreval(" Preço do produto: ", pre)
  escreval(" Quantidade comprada: ", uni)
  escreval(" Dinheiro recebido: ", din)
  escreval("***********************************")
  escreval(" troco = ", troco)
  escreval("***********************************")

fimalgoritmo
