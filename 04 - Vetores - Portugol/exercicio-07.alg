algoritmo "Nome do Programa"

var
x, i, : inteiro

vetA : vetor [0..9] de inteiro
vetB : vetor [0..9] de inteiro
vetC : vetor [0..9] de inteiro

inicio

  escreval("*************************")
  escreval("* Programa soma vetores *")
  escreval("*************************")

  escreval(" ")

  escreval("Quantos valore vai ter cada vetor? ")
  leia(x)

  escreval(" ")
  
  escreval("Digite os valores do velor A")

  para i de 0 ate x-1 faca
    escreval("Valor N", i, " do vetor A: ")
    leia(vetA[i])
  fimpara

  escreval(" ")

  escreval("Digite os valores do velor B")
  
  para i de 0 ate x-1 faca
    escreval("Valor N", i, " do vetor B: ")
    leia(vetB[i])
  fimpara
  
  escreval(" ")

  

  para i de 0 ate x-1 faca
    vetC[i] <- vetA[i] + vetB[i]
  fimpara

  para i de 0 ate x-1 faca 
    escreval("A soma de ", vetA[i], " + ", vetB[i], " é = ", vetC[i])
  fimpara


fimalgoritmo
