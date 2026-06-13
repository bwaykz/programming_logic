algoritmo "Problema Terreno"
var

lar, comp, metro, area, preco: real

inicio

  Escreval("****************************")
  Escreval("* Converter area por preço *")
  Escreval("****************************")

  Escreval("")

  Escreval("Digite a largura do terreno: ")
  leia(lar)

  Escreval("Digite o comprimento do terreno: ")
  leia(comp)

  Escreval("Digite o valor do metro quadrado: ")
  leia(metro)
  
  Escreval("")

  area <- lar * comp
  preco <- area * metro

  Escreval("***********************************")
  Escreval("* Area do terreno :     ", area, "       *")
  Escreval("* Preço do terreno: ", preco:4:2, "  *")
  Escreval("***********************************")

fimalgoritmo
