algoritmo "Soma_impares"

var

 x, y, troca, soma , i : inteiro

inicio

  escreval("*************************")
  escreval("* Programa soma impares *")
  escreval("*************************")

  escreval(" ")

  escreval("Digite o primierio numero: ")
  leia(x)

  escreval("Digite o segundo numero: ")
  leia(y)


  se (x < y) entao
    troca <- x
    x <- y
    y <- troca
  fimse

  soma <- 0 

  para i de x-1 ate y+1 faca
    se i % 2 <> 0 entao
      soma <- soma + i
    fimse
  fimpara

  escreval("Soma dos impares = ", soma)
  



fimalgoritmo
