algoritmo "Nome do Programa"

var

l, c, i, j :inteiro

matA : vetor [0..9, 0..9] de inteiro 
matB : vetor [0..9, 0..9] de inteiro
matC : vetor [0..9, 0..9] de inteiro


inicio
  escreval("**************************")
  escreval("* Programa soma matrizes *")
  escreval("**************************")

  escreval(" ")

  escreval("Quantas linhas vai ter cada matriz: ")
  leia(l)

  escreval("Quantas colunas vai ter cada matriz: ")
  leia(c)

  escreval(" ")

  para i de 0 ate l-1 faca
    para j de 0 ate c-1 faca
    
    escreval("Elemento [", i, ",", j, "]:")
    leia(matA[i,j])

    fimpara
  fimpara

  escreval(" ")

  escreval("Digite os valores da matriz A")

   para i de 0 ate l-1 faca
    para j de 0 ate c-1 faca
    
    escreval("Elemento [", i, ",", j, "]:")
    leia(matB[i,j])

    fimpara
  fimpara


  escreval(" ")

  escreval("Digite os valores da matriz B")

   para i de 0 ate l-1 faca
    para j de 0 ate c-1 faca
    
    matC[i,j] <- matA[i,j] + matB[i,j]
    
    fimpara
  fimpara

  escreval(" ")

  escreval("Matriz soma: ")

  para i de 0 ate l-1 faca
    para j de 0 ate c-1 faca
    
    escreva(matC[i,j])
    
    fimpara
    escreval(" ")
  fimpara

fimalgoritmo
