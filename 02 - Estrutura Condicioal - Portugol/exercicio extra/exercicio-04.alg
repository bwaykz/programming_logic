algoritmo "Nome do Programa"

var

salario, novoSalario, aumento : real

inicio

  escreval("*********************************************")
  escreval("* Programa para calcular aumento de salario *")
  escreval("*********************************************")
  
  escreval(" ")

  escreval("Digite o salario da pessoa: ")
  leia(salario)

  escreval(" ")


  se (salario <= 1000) entao
    novoSalario <- (salario * 20) / 100 + salario
    aumento <- abs(salario - novoSalario)
    escreval("Novo salario : ", novoSalario)
    escreval("Aumento = R$: ", aumento)
    escreval("Porcentagem = 20%")
  senao
    se (salario <= 3000) entao 
      novoSalario <- (salario * 15) / 100 + salario
      aumento <- abs(salario - novoSalario)
      escreval("Novo salario: ", novoSalario)
      escreval("Aumento = R$: ", aumento)
      escreval("Porcentagem = 15%")
    senao
      se (salario <= 8000) entao
        novoSalario <- (salario * 10) / 100 + salario
        aumento <- abs(salario - novoSalario)
        escreval("Novo salario: ", novoSalario)
        escreval("Aumento = R$: ", aumento)
        escreval("Porcentagem = 10%")
      senao
        novoSalario <- (salario * 5) / 100 + salario
        aumento <- abs(salario - novoSalario)
        escreval("Novo salario: ", novoSalario)
        escreval("Aumento = R$: ", aumento)
        escreval("Porcentagem = 5%")
      fimse
    fimse
  fimse


  escreval(" ")


fimalgoritmo
