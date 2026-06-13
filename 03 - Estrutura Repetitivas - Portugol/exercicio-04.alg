algoritmo "Combustivel"

var
x : inteiro

al, ga, di : inteiro


inicio
  
  al <- 0
  ga <- 0
  di <- 0


  escreval("************************")
  escreval("* Programa Combustivel *")
  escreval("************************")

  escreval(" ")

  escreval("digite um numero: ")
  leia(x)


  enquanto (x <> 4) faca
   escreval("Informe um codigo (1, 2, 3) ou 4 para parar")
   leia(x)
    escolha x
    caso 1
      al <- 1 + al
    caso 2
      ga <- ga + 1
    caso 3
      di <- di + 1
    fimescolha
  fimenquanto

  escreval("Muito Obrigado")
  escreval("Alcool: ", al)
  escreval("Gasolina: ", ga)
  escreval("Diesel: ", di)

fimalgoritmo
