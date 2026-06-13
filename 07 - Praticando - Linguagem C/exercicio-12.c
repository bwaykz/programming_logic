#include <stdio.h>
#include <string.h>

void clear_entry() {
  char c;
  while ((c = getchar()) != '\n' && c != EOF) {
  }
}

void read_text(char *buffer, int length) {
  fgets(buffer, length, stdin);
  strtok(buffer, "\n");
}

int main() { 

  double salario1, salario2;
  char nome1[50], nome2[50];
  int idade;
  char sexo;

  printf("********************\n");
  printf("* Programa Salario *\n");
  printf("********************\n");

  printf(" \n");

  printf("Nome da primeira pessoa: \n");
  read_text(nome1, 50);

  printf("\n");

  printf("Salario da primeira pessoa: \n");
  scanf("%lf", &salario1);

  printf("Nome da segunda pessoa: \n");
  clear_entry();
  read_text(nome2, 50);

  printf("Salario da segunda pessoa: \n");
  scanf("%lf", &salario2);

  printf("Digite uma idade: \n");
  scanf("%d", &idade);
  
  clear_entry();

  printf("Digite um sexo (F/N): \n");
  scanf("%c", &sexo);

  printf("Nome 1: %s \n", nome1);
  printf("Salario 1: %.2lf \n", salario1);
  printf("Nome 2: %s \n", nome2);
  printf("Salario 2: %.2lf \n", salario2);
  printf("Sexo: %c \n", sexo);
  printf("Idade: %d \n", idade);

  return 0;
}
