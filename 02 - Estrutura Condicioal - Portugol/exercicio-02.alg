Algoritmo "baskara"

Var
   a, b, c, delta, x1, x2 : real

Inicio
   // Entrada de dados
   escreva("Coeficiente a: ")
   leia(a)
   escreva("Coeficiente b: ")
   leia(b)
   escreva("Coeficiente c: ")
   leia(c)

   // Processamento do Delta
   delta <- (b ^ 2) - 4 * a * c

   // Estrutura condicional para verificar se existem raízes reais
   se (a = 0) ou (delta < 0) entao
      escreval("Esta equacao nao possui raizes reais")
   senao
      // Calculo das raízes apenas se a condição acima for falsa
      x1 <- (-b + RaizQ(delta)) / (2 * a)
      x2 <- (-b - RaizQ(delta)) / (2 * a)
      
      // Saída de dados formatada
      escreval("X1 = ", x1:1:4)
      escreval("X2 = ", x2:1:4)
   fimse