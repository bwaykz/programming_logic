algoritmo "Glicose"

var

  nor, ele, dia : caractere
  med : real


inicio

  escreval("*********************************************")
  escreval("* Programa para ler a quandidade de Glicose *")
  escreval("*********************************************")

  escreval(" ")

  escreval("Digite a medida da glicose: ")
  leia(med)

  escreval(" ")

  se (med < 100) entao
    nor <- "normal"
    escreval("Classificaçao: ", nor)
  senao
    se (med < 140) entao
      ele <- "elevado"
      escreval("Classificaçao: ", ele)
    senao
      dia <- "diabetes"
      escreval("Classificaçao: ", dia)
    fimse 
  fimse 



fimalgoritmo
