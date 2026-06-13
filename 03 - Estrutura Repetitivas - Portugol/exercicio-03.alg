algoritmo "Nome do Programa"

var

  x, y, media : real

inicio

  escreval("******************************")
  escreval("* Programa Validaçao De Nota *")
  escreval("******************************")

  escreval(" ")
  
  escreval("Digite a primeira nota : ")
  leia(x)

  enquanto (x < 0) ou (x > 10) faca
    escreval("Valor Invalido! tente Novamente: " )
    leia(x)
  fimenquanto

  escreval(" ")

  escreval("Digite a segunda nota: ")
  leia(y)

  enquanto (y < 0) ou (y > 10) faca
    escreval("Valor Invalido! Tente Novamente: ")
    leia(y)
  fimenquanto

  media <- (x + y) / 2

  escreval("Primeira Nota: ", x)
  escreval("Segunda Nota: ", y)
  escreval("Media = ", media)




fimalgoritmo
