algoritmo "Nome do Programa"

var

x, i, j, maior : inteiro

mat : vetor [0..9, 0..9] de inteiro


inicio

  escreval("***********************")
  escreval("* Programa Cada Linha *")
  escreval("***********************")

  escreval("")
  
  escreval("Qual a ordem da matriz")
  leia(x)

  para i de 0 ate x-1 faca
    para j de 0 ate x-1 faca

      escreval("Elemento [", i, ",", j, "]:")
      leia(mat[i,j])
   
    fimpara
  fimpara

  escreval(" ")

  escreval("Maior elemento de cada linha: ")
  para i de 0 ate x-1 faca
    maior <- mat[i,0]
    para j de 0 ate x-1 faca
      se (mat[i,j] > maior) entao

      maior <- mat[i,j]
      
      fimse
    fimpara
      escreval(maior)

  fimpara




fimalgoritmo
