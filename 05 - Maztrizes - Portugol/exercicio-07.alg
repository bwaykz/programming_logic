algoritmo "Acima_Diagonal"

var
   n, i, j, limiteN, soma : inteiro
   mat : vetor [0..9, 0..9] de inteiro

inicio
   // 1. Lendo a ordem da matriz quadrada
   escreva("Qual a ordem da matriz? ")
   leia(n)

   // Contornando o bug do laço
   limiteN <- n - 1

   // 2. Lendo todos os elementos da matriz
   para i de 0 ate limiteN faca
      para j de 0 ate limiteN faca
         escreva("Elemento [", i, ",", j, "]: ")
         leia(mat[i,j])
      fimpara
   fimpara

   // 3. Somando os elementos ACIMA da diagonal principal
   soma <- 0
   
   para i de 0 ate limiteN faca
      para j de 0 ate limiteN faca
         
         // A mágica acontece aqui: só soma se a coluna for maior que a linha
         se (j > i) entao
            soma <- soma + mat[i,j]
         fimse
         
      fimpara
   fimpara

   // 4. Exibindo o resultado final
   escreval("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = ", soma)

fimalgoritmo
