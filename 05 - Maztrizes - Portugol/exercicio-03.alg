algoritmo "Nome do Programa"

var

l, c, i, j, soma1, soma2 : inteiro 

mat : vetor [1..10 , 1..10] de inteiro


inicio


  escreval("************************")
  escreval("* Programa soma linhas *")
  escreval("************************")

  escreval(" ")

  escreval("Qual a quantidade de linhas da matriz: ")
  leia(l)

  escreval("Qual a quantidade de colunas da matriz: ")
  leia(c)

  escreval(" ")

  para i de 1 ate l faca
    escreval("Digite os elementos da ", i, "a. linha: ")
    para j de 1 ate c faca
      
      leia(mat[i,j])
      

    fimpara
  fimpara

  escreval(" ")

  para i de 1 ate l faca 
    para j de 1 ate c faca
    
      se (i = 1) entao
        soma1 <- soma1 + mat[i,j]
      senao
        soma2 <- soma2 + mat[i,j]
      fimse

    fimpara
  fimpara

  escreval("Soma da 1a linha: ", soma1)
  escreval("Soma da 2a linha: ", soma2)



fimalgoritmo
