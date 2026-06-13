algoritmo "conversao_celsius_fahrenheit"
var

c, f : real
resp : caractere


inicio

escreval("*************************")
escreval("* Programa de conversao *")
escreval("*************************")

escreval(" ")

//repita 
//escreval("Digite a temperatura em Celsius: ")
//leia(c)

//f <- (c * 9.0) / 5.0 + 32.0

//escreval("A temperatura em Fahrenheit é: ", f)
//escreval("Deseja repetir (S/N)? ")
//leia(resp)

repita
  escreval("Digite a temperatura em Celsius: ")
  leia(c)

  f <- (c * 9.0) / 5.0 + 32.0

  escreval("A temperatura em Fahrenheit é: ", f)
  escreval("Deseja repetir (S/N)? ")
  leia(resp)
ate (resp <> "s") e (resp <> "S")






fimalgoritmo
