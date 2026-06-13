Algoritmo "duracao"

Var
   duracao, horas, resto, minutos, segundos : inteiro

Inicio
   // Entrada de dados
   escreva("Digite a duracao em segundos: ")
   leia(duracao)

   // Processamento
   horas <- duracao \ 3600
   resto <- duracao % 3600
   minutos <- resto \ 60
   segundos <- resto % 60

   // Saída de dados
   escreval(horas, ":", minutos, ":", segundos)

Fimalgoritmo
