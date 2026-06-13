algoritmo "Dentro_Fora"

var


n, x, i, fora, dentro : inteiro


inicio

  dentro <- 0
  fora <- 0

  escreval("************************")
  escreval("* Programa Dentro Fora *")
  escreval("************************")

  escreval(" ")

  escreval("Quantos números você vai digitar? ")
  leia(n)

  para i de 1 ate n faca
    escreval("Digite um numero: ")
    leia(x)

    se (x >= 10) e (x <= 20) entao
      dentro <- dentro + 1
    senao
      fora <- fora + 1
    fimse
  fimpara

  escreval(" ")
  
  escreval(dentro, " Dentro")
  escreval(fora," Fora ")



fimalgoritmo 
