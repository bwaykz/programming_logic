algoritmo "Matriz_Geral"

var
   n, i, j, limiteN, linha, coluna : inteiro
   somaPositivos : real
   mat : vetor [0..9, 0..9] de real

inicio
   // --- LEITURA INICIAL ---
   escreva("Qual a ordem da matriz? ")
   leia(n)
   
   limiteN <- n - 1

   para i de 0 ate limiteN faca
      para j de 0 ate limiteN faca
         escreva("Elemento [", i, ",", j, "]: ")
         leia(mat[i,j])
      fimpara
   fimpara

   // --- A) SOMA DOS POSITIVOS ---
   somaPositivos <- 0
   para i de 0 ate limiteN faca
      para j de 0 ate limiteN faca
         se (mat[i,j] > 0) entao
            somaPositivos <- somaPositivos + mat[i,j]
         fimse
      fimpara
   fimpara
   escreval()
   escreval("SOMA DOS POSITIVOS: ", somaPositivos)


   // --- B) IMPRIMIR UMA LINHA ESCOLHIDA ---
   escreval()
   escreva("Escolha uma linha: ")
   leia(linha)
   
   escreva("LINHA ESCOLHIDA: ")
   // Para imprimir uma linha, a linha fica travada e apenas a coluna (j) varia
   para j de 0 ate limiteN faca
      escreva(mat[linha, j], " ")
   fimpara
   escreval()


   // --- C) IMPRIMIR UMA COLUNA ESCOLHIDA ---
   escreval()
   escreva("Escolha uma coluna: ")
   leia(coluna)
   
   escreva("COLUNA ESCOLHIDA: ")
   // Para imprimir uma coluna, a coluna fica travada e apenas a linha (i) varia
   para i de 0 ate limiteN faca
      escreva(mat[i, coluna], " ")
   fimpara
   escreval()


   // --- D) DIAGONAL PRINCIPAL ---
   escreval()
   escreva("DIAGONAL PRINCIPAL: ")
   // Na diagonal principal, a linha e a coluna são sempre iguais [0,0], [1,1], etc.
   // Por isso, precisamos de apenas um laço rodando a variável "i" nos dois lugares!
   para i de 0 ate limiteN faca
      escreva(mat[i, i], " ")
   fimpara
   escreval()


   // --- E) ALTERAR NEGATIVOS PARA O QUADRADO E IMPRIMIR ---
   // Primeiro, varremos a matriz procurando os negativos para alterá-los
   para i de 0 ate limiteN faca
      para j de 0 ate limiteN faca
         se (mat[i,j] < 0) entao
            // Multiplicar por ele mesmo é a forma mais segura de fazer o quadrado
            mat[i,j] <- mat[i,j] * mat[i,j] 
         fimse
      fimpara
   fimpara

   escreval()
   escreval()
   escreval("MATRIZ ALTERADA:")
   
   // Por fim, imprimimos a matriz completa com a grade formatada
   para i de 0 ate limiteN faca
      para j de 0 ate limiteN faca
         escreva(mat[i,j], " ")
      fimpara
      escreval()
   fimpara

fimalgoritmo
