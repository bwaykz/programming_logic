algoritmo "Nome do Programa"
var
y : real
x, i : inteiro
vet : vetor [0..9] de real



inicio


  escreval("Quantos numeros voce vai digitar? ")
  leia(x)

  para i de 1 ate x faca
    escreval("Digite um numero: ")
    leia(y)
    vet[i] <- y
  fimpara

  escreval("")

  i <- 0
  escreval("Numeros digitados: ")
  para i de 1 ate x faca
    escreval(vet[i])

  fimpara



fimalgoritmo
