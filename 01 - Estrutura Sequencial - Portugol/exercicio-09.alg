Algoritmo "medidas"

Var
   A, B, C : real
   areaQuadrado, areaTriangulo, areaTrapezio : real

Inicio
   // Entrada de dados
   escreva("Digite a medida A: ")
   leia(A)
   escreva("Digite a medida B: ")
   leia(B)
   escreva("Digite a medida C: ")
   leia(C)

   // Processamento
   areaQuadrado <- A * A
   areaTriangulo <- (A * B) / 2
   areaTrapezio <- ((A + B) * C) / 2

   // Saída de dados com formatação de 4 casas decimais
   escreval("AREA DO QUADRADO = ", areaQuadrado:1:4)
   escreval("AREA DO TRIANGULO = ", areaTriangulo:1:4)
   escreval("AREA DO TRAPEZIO = ", areaTrapezio:1:4)

Fimalgoritmo
