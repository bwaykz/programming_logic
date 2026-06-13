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

  int x, i, neg;
  int vet[9];

  printf("**********************\n");
  printf("* Programa Negativos *\n");
  printf("**********************\n");

  printf("\n");

  printf("Quantos numeros voce vai digitar: \n");
  scanf("%d", &x);

  for (i = 0; i < x; i++) {
    printf("Digite um numero: \n");
    scanf("%d", &vet[i]);
  }

  printf("\n");
  printf("Numeros Negativos: ");

  for (i = 0; i <= x; i++) {
    if (vet[i] < 0) {

    
      printf("%d ", vet[i]);
    
    }
  }
  





  

  return 0;
}
