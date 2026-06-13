algoritmo "soma_impares"

var
   X, Y, menor, maior, i, soma: inteiro

inicio

  escreval("***************************************")
  escreval("* SOMA DOS IMPARES ENTRE DOIS NUMEROS *")
  escreval("***************************************")

   escreva("Digite dois números: ")
   leia(X)
   leia(Y)

   // Define o menor e o maior entre X e Y
   se X < Y entao
      menor <- X
      maior <- Y
   senao
      menor <- Y
      maior <- X
   fimse

   soma <- 0

   // Percorre os números entre menor e maior (exclusive)
   para i de menor+1 ate maior-1 passo 1 faca
      se i % 2 <> 0 entao   // se for ímpar
         soma <- soma + i
      fimse
   fimpara

   escreval("SOMA DOS IMPARES = ", soma)

fimalgoritmo