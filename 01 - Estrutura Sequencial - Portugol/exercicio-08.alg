algoritmo "Combustivel"

var

dis : inteiro
combu, resu : real


inicio

  escreval("************************************************")
  escreval("* Programa Para Medir o Consumo De Conbustivel *")
  escreval("************************************************")
  
  escreval(" ")

  escreval("Digite a distancia percorrida: ")
  leia(dis)

  escreval("Digite quanto Conbustivel foi gasto: ")
  leia(combu)

  resu <- dis / combu

  escreval(" ")

  escreval("*************************************")
  escreval(" Distancia percorrida: ", dis)
  escreval(" Conbustivel gasto: ", combu)
  escreval("*************************************")
  escreval(" Consumo medio = ", resu)
  escreval("*************************************")

fimalgoritmo
