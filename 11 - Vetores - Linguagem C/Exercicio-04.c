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

  int x, i, quan;
  int vet[9];

  printf("**************************\n");
  printf("* Programa Numeros Pares *\n");
  printf("**************************\n");

  printf("\n");

  printf("Quantos numeros voce vai digitar: \n");
  scanf("%d", &x);

  for (i = 0;i < x; i++) {

    printf("Digite um numero: \n");
    scanf("%d", &vet[i]);

  }

  printf("Numeros pares: \n");

  quan = 0;
  for (i = 0 ;i < x; i++) {
  
    if (vet[i] % 2 == 0) {
      printf("%d ", vet[i]);
      quan = quan + 1;
    
    }
  }
  
  printf("\n");

  printf("Quantidade de pares = %d \n", quan);

  return 0;
}







