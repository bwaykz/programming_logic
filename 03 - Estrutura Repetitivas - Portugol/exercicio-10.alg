algoritmo "sequencia_impares"

var

x, i, soma : inteiro

inicio


 escreval("*************************")
 escreval("* Programa soma impares *")
 escreval("*************************")

 escreval(" ")

 escreval("Digite um numero: ")
 leia(x)

  soma <- 0
  para i de 1 ate x faca
    se i % 2 <> 0 entao
      //soma <- soma + i
      escreval(i)
    fimse
  fimpara

  

fimalgoritmo
