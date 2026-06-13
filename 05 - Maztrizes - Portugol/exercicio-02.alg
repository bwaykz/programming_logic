algoritmo "Nome do Programa"

var

n, i, j, cont : inteiro
mat : vetor [0..9, 0..9] de inteiro

inicio

  escreval("*******************************")
  escreval("* Programa Diagonal_Negativos *")
  escreval("*******************************")

  escreval(" ")

  escreval("Qual a ordem da matriz: ")
  leia(n)

  escreval(" ")

  para i de 0 ate n-1 faca
    para j de 0 ate n-1 faca
      
      escreval("Elemento[", i, ",", j, "]:")
      leia(mat[i,j])

    fimpara
  fimpara


  escreval(" ")

  escreval("Diagonal principal: ")

  para i de 0 ate n-1 faca
    para j de 0 ate n-1 faca
      
      se (mat[i,j] < 0) entao 
        cont <- cont + 1
      fimse
      
      se ( i = j ) entao
        escreva(mat[i,j])
      fimse

    fimpara
  fimpara

  escreval(" ")

  escreval("Quantidade de negativos = ", cont)




fimalgoritmo
