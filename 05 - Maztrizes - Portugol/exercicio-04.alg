algoritmo "Nome do Programa"

var
l, c, i, j : inteiro

mat : vetor [0..9, 0..9] de inteiro


inicio

  escreval("****************************")
  escreval("* Programa Negativo Matriz *")
  escreval("****************************")

  escreval(" ")

  escreval("Qual a quantidade de linhas da matriz: ")
  leia(l)

  escreval("Qual a quantidade de colunas da matriz: ")
  leia(c)

  escreval(" ")

  para i de 0 ate l-1 faca
    para j de 0 ate c-1 faca
  
      escreval("Elemento[", i, ",", j, "]:")
      leia(mat[i,j])

    fimpara
  fimpara

  escreval(" ")

  escreval("Valores negativos: ")
  
  para i de 0 ate l-1 faca
    para j de 0 ate c-1 faca
    
      se (mat[i,j] < 0)entao
      
        escreval(mat[i,j])
    
      fimse

    fimpara
  fimpara 


fimalgoritmo
