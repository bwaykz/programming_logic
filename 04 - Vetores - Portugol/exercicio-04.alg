algoritmo "Alturas"

var
   x, i, cont_menores : inteiro
   soma, media, porcentagem : real
   nome : vetor [1..10] de caractere
   idade : vetor [1..10] de inteiro
   altura : vetor [1..10] de real

inicio
   escreval("********************************")
   escreval("* Programa Alturas (Enquanto)  *")
   escreval("********************************")
   escreval(" ")

   escreval("Quantas pessoas serao digitadas: ")
   leia(x)

   // 1. Lendo os dados
   i <- 1
   enquanto (i <= x) faca
      escreval("Dados da ", i, "a pessoa: ")
      
      escreval("Nome: ")
      leia(nome[i])
      
      escreval("Idade: ")
      leia(idade[i])
      
      escreval("Altura: ")
      leia(altura[i])
      
      i <- i + 1 // Incremento obrigatório do enquanto
   fimenquanto

   // 2. Somando apenas as alturas
   soma <- 0
   i <- 1 // Precisamos resetar o "i" para a gaveta 1 novamente
   enquanto (i <= x) faca
      soma <- soma + altura[i]
      i <- i + 1
   fimenquanto

   // 3. Calculando e mostrando a média das alturas
   media <- soma / x
   escreval(" ")
   escreval("Altura media: ", media)

   // 4. Contando os menores de idade
   cont_menores <- 0
   i <- 1 // Resetando o "i" mais uma vez
   enquanto (i <= x) faca
      se (idade[i] < 16) entao
         cont_menores <- cont_menores + 1
      fimse
      i <- i + 1
   fimenquanto

   // 5. Calculando a porcentagem e imprimindo
   porcentagem <- (cont_menores / x) * 100
   escreval("Pessoas com menos de 16 anos: ", porcentagem, "%")

   // 6. Listando os nomes dos menores
   i <- 1 // Último reset do "i"
   enquanto (i <= x) faca
      se (idade[i] < 16) entao
         escreval(nome[i])
      fimse
      i <- i + 1
   fimenquanto

fimalgoritmo