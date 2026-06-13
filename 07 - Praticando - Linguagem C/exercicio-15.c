#include <stdio.h>
#include <string.h>

int main() {

  int x, soma, n, i;

  printf("*********************\n");
  printf("* Programa For Soma *\n");
  printf("*********************\n");

  printf("\n");

  printf("Quantos numeros serao digitados: ");
  scanf("%d", &n);

  soma = 0;

  for (i = 0; i < n; i++) {
    printf("Digite um numero: \n");
    scanf("%d", &x);
    soma = soma + x;
  }

  printf("\n");

  printf("Soma e = %d\n", soma);
}
