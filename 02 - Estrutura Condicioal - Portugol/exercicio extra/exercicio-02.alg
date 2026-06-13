algoritmo "Tempo de jogo"
var

duracao, hoin, hofi : inteiro

inicio

  escreval("**************************")
  escreval("* Programa tempo de jogo *")
  escreval("**************************")

  escreval(" ")

  escreval("Digite a hora inicial: ")
  leia(hoin)

  escreval("Digite a hora final: ")
  leia(hofi)

  escreval(" ")

  se (hoin > hofi) entao
    duracao <- 24 - (hoin - hofi)
    escreval("O jogo durou: ", duracao)
  senao
    se (hoin = hofi) entao
      escreval("O jogo durou: 24")
    senao
    duracao <-  hofi - hoin
      escreval("O jogo durou: ", duracao)
    fimse
  fimse
  
fimalgoritmo
