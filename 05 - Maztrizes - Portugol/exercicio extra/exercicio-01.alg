algoritmo "Nome do Programa"
var

x, i, l, c : inteiro

a : vetor [1..3, 1..4] de inteiro


inicio

  escreval("**********************")
  escreval("* Programa Positivos *")
  escreval("**********************")

  escreval(" ")

  escreval("Quantas linhas vai ter a matriz? ")
  leia(l)

  escreval("Quantas colunas vai ter a matriz? ")
  leia(c)


  para i de 1 ate l faca
    para x de 1 ate c faca
    
      escreval("Elemento [",i, ",",x,"]" )
      leia(a[i,x])


    fimpara
  fimpara

  escreval(" ")

  escreval("Matriz digitada: ")

  para i de 1 ate l faca
    para x de 1 ate c faca
  
      escreva(a[x]," ")
      escreval("")
      escreva(a[i], " ")

    fimpara
  fimpara



fimalgoritmo
