algoritmo "Nome do Programa"

var

  pre, din, tro, valor : real
  uni : inteiro

inicio

  escreval("********************************")
  escreval("* Programa para calcular troco *")
  escreval("********************************")

  escreval(" ")

  escreval("Qual e o preço do produto: ")
  leia(pre)

  escreval("Quantas unidades: ")
  leia(uni)

  escreval("Quantos reais o cliente pagou: ")
  leia(din)

  escreval(" ")
  
  valor <- pre * uni
  tro <- abs(din - valor)

  se (din >= valor) entao
    escreval("Troco = ", tro:2:2)
  senao
    escreval("Dinheiro insuficiente. Faltam ", tro:2:2, " reais")
  fimse





fimalgoritmo
