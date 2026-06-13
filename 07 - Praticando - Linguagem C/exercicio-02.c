#include <stdio.h>
#include <string.h>

int main() {

  int idade;
  double salario, altura;
  char genero;
  char nome[50];

  printf("********************\n");
  printf("* Programa salario *\n");
  printf("********************\n");

  idade = 20;
  salario = 5800.5;
  altura = 1.63;
  genero = 'F';
  strcpy(nome, "Maria Silva");

  printf(" ");

  printf("Idade = %d\n", idade);
  printf("Salario = %fl\n", salario);
  printf("Altura = %fl\n", altura);
  printf("Genero =  %c\n", genero);
  printf("Nome =  %s\n", nome); 
  
  

  return 0;
}
