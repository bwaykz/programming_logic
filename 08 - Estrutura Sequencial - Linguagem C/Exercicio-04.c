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

  int x, y, soma;

  printf("*****************\n");
  printf("* Programa soma *\n");
  printf("*****************\n");

  printf("\n");

  printf("Digite o valor de x: \n");
  scanf("%d", &x);

  clear_entry();

  printf("Digite o valor de y: \n");
  scanf("%d", &y);

  soma = x + y;

  printf("Soma = %d", soma);




}







