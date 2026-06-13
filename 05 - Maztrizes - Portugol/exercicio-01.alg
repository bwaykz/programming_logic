algoritmo "Nome do Programa"

var


l, c, i, j : inteiro

mat : vetor [0..9, 0..9] de inteiro


inicio
  
    escreval("*************************")
    escreval("* Programa teste matriz *")
    escreval("*************************")

    escreval(" ")

    escreval("Quantas linhas vao ter cada matriz? ")
    leia(l)

    escreval("Quantas colunas vai ter cada matriz? ")
    leia(c)

    para i de 0 ate l-1 faca
      para j de 0 ate c-1 faca
      
        escreval("Elemento [", i, ",", j, "]:" )
        leia(mat[i,j])

      fimpara
    fimpara 

    escreval(" ")

    escreval("Matriz Digitada: ")

    para i de 0 ate l-1 faca
      se (mat[j] = 0) entao
      escreval(" ")
      fimse

      para j de 0 ate c-1 faca

        escreva(mat[i,j], " ")

      fimpara
    fimpara

fimalgoritmo
