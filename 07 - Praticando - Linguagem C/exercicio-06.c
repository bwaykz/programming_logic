#include <stdio.h>
#include <string.h>

int main () {

  int idade ;
  double salario;
  char nome[50];
  char sexo;

  idade = 32;
  salario = 4560.9;
  sexo = 'F';
  strcpy(nome, "Maria silva");

  printf("a funcionaria %s do sexo %c ganha %2.f e tem %i anos", nome, sexo, salario, idade);


  return 0;
}
