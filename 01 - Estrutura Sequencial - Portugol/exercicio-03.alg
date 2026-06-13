algoritmo "Idades"
var

  nome1, nome2 : caractere
  idade1, idade2 : inteiro
  media: real




inicio


  escreval("****************************************")
  escreval("* Digite o nome e a idade de 2 pessoas *")
  escreval("****************************************")
  
  escreval(" ")

  
  escreval("Digite o nome da primeira pessoa: ")
  leia(nome1)

  escreval("Digite a idade de ", nome1)
  leia(idade1)
  
  escreval("Digite o nome da segunda pessoa: ")
  leia(nome2)

  escreval("Digite a idade de ", nome2)
  leia(idade2)


  escreval(" ")


  media <- (idade1 + idade2) / 2

  escreval("**************************************************************")
  escreval("  Dados da primeira pessoa:                                   ")
  escreval("  Nome: ", nome1, "                                           ")
  escreval("  idade: ", idade1, "                                         ")
  escreval("**************************************************************")
  escreval("  Dados da segunda pessoa:                                    ")
  escreval("  Nome: ", nome2, "                                           ")
  escreval("  idade: ", idade2, "                                         ")
  escreval("**************************************************************")
  escreval("  A idade média de ", nome1, " e ", nome2, " é de ", media, " anos")
  escreval("**************************************************************")






fimalgoritmo
