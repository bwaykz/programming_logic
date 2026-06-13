algoritmo "maior posiçao"

var

x, i, posi : inteiro
maior : real

number : vetor [0..99] de real
 

inicio

  escreval("Quantos numeros você vai digitar? ")
  leia(x)

  para i de 0 ate x-1 faca
    escreval("digite um numero: ")
    leia(number[i])
  fimpara

  maior <- 0
  
  para i de 0 ate x-1 faca
    se number[i] > maior entao
      maior <- number[i]
      posi <- i
    fimse
  fimpara  

  escreval("maior valor = ", maior)
  escreval("posiçao do maior valor = ", posi)

fimalgoritmo
