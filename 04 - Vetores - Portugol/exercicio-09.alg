algoritmo "media_pares"

var
x, i, contador, soma : inteiro
media : real
vet : vetor [0..99] de inteiro

inicio

escreval("***************************")
escreval("* Programa media pares    *")
escreval("***************************")

escreval(" ")

escreval("Quantos elementos vai ter o vetor? ")
leia(x)

escreval(" ")

contador <- 0
soma <- 0

para i de 0 ate x-1 faca
    escreval("Digite um numero: ")
    leia(vet[i])
    
    se (vet[i] % 2 = 0) entao
        soma <- soma + vet[i]
        contador <- contador + 1
    fimse
fimpara

escreval(" ")

se (contador > 0) entao
    media <- soma / contador
    // O :4:1 formata o número para ter 1 casa decimal, igual ao exemplo do exercício
    escreval("MEDIA DOS PARES = ", media:4:1) 
senao
    escreval("NENHUM NUMERO PAR")
fimse

fimalgoritmo
