Algoritmo "temperatura"

Var
   escala : caractere
   C, F : real

Inicio
   // Entrada da escala
   escreva("Voce vai digitar a temperatura em qual escala (C/F)? ")
   leia(escala)

   // Estrutura condicional para decidir o cálculo com base na letra digitada
   se (escala = "F") ou (escala = "f") entao
      escreva("Digite a temperatura em Fahrenheit: ")
      leia(F)
      
      // Cálculo de Fahrenheit para Celsius
      C <- 5 / 9 * (F - 32)
      
      escreval("Temperatura equivalente em Celsius: ", C:1:2)
   senao
      se (escala = "C") ou (escala = "c") entao
         escreva("Digite a temperatura em Celsius: ")
         leia(C)
         
         // Cálculo de Celsius para Fahrenheit
         F <- 9 * C / 5 + 32
         
         escreval("Temperatura equivalente em Fahrenheit: ", F:1:2)
      fimse
   fimse

Fimalgoritmo