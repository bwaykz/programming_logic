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

  int x, y, z;

  printf("**************************\n");
  printf("* Programa Menor de tres *\n");
  printf("**************************\n");

  printf("\n");

  printf("Digite o primeiro valor: \n");
  scanf("%d", &x);

  printf("Digite o segundo valor: \n");
  scanf("%d", &y);

  printf("Digite o terceiro valor: \n");
  scanf("%d", &z);

  printf("\n");

  if ((x < y) && (x < z)) {
    printf("Menor = %d", x);
  } else if ((y < x) && (y < z)) {
    printf("Menor = %d", y);
  } else {
    printf("Menor = %d", z);
  }

}
