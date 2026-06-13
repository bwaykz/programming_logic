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

int main () {

  int x, soma;

  soma = 0;

  printf("**************************\n");
  printf("* Programa Soma enquanto *\n");
  printf("**************************\n");

  printf("\n");

  printf("Digite o primeiro numero\n");
  scanf("%d", &x);


  while (x != 0) {
    soma = soma + x;
    printf("Digite outro numero: \n");
    scanf("%d", &x);
  }

  printf(" \n");

  printf("A soma e: %d\n", soma);

  return 0 ;
}
