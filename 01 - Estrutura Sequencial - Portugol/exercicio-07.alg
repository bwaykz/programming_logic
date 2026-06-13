algoritmo "Pagemento"

var

  nome : caractere
  valor, pagar : real
  horas : inteiro



inicio

  escreval("*************************************")
  escreval("* Programa para qualcular Pagemento *")
  escreval("*************************************")

  escreval(" ")

  escreval("Digite o seu nome: ")
  leia(nome)

  escreval("Digite o valor por hora: ")
  leia(valor)

  escreval("Digite quantas horas trabalhadas: ")
  leia(horas)

  pagar <- valor * horas

  escreval(" ")

  escreval("******************************************************")
  escreval(" Nome: ", nome)
  escreval(" Valor por hora: ", valor)
  escreval(" Horas trabalhadas: ", horas)
  escreval("******************************************************")
  escreval(" O pagamento para ", nome, " Deve ser R$: ", pagar:4:2)
  escreval("******************************************************")

fimalgoritmo
