#include <stdio.h>
#include <string.h>

void limpar_entrada() {
char c;
while ((c = getchar()) != '\n' && c != EOF) {}
}

int main () {
  

  int x, i;

  printf("Quantos numeros voce vai digitar? ");
  scanf("%d", &x);

  double vet[x];

  for (i = 0; i < x ; i++) {
  
    printf("Elemento [%d]:\n", i);
    limpar_entrada();
    scanf("%lf", &vet[i]);
  };

  for (i = 0; i < x ; i++) {
    printf(" %.1lf ", vet[i]);
  }


  return 0 ;
}
