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

  int x, i;
  int vetA[9];
  int vetB[9];
  int vetC[9];

  printf("*************************\n");
  printf("* Programa Soma Vetores *\n");
  printf("*************************\n");

  printf("\n");

  printf("Quantos valores vai ter cada vetor: \n");
  scanf("%d", &x);

  printf("Digite os Valores do vetor A:\n");

  for (i = 0; i < x; i++) {

    printf("Elemento [%d]:\n", i);
    scanf("%d", &vetA[i]);

  }

  printf("Digite os Valores do vetor B:\n");

  for (i = 0; i < x; i++) {

    printf("Elemento [%d]:\n", i);
    scanf("%d", &vetB[i]);

  }
 
  printf("\n");

  printf("Vetor resultante: \n");

  for (i = 0; i < x; i++) {
  
    vetC[i] =  vetA[i] + vetB[i];
    printf("%d\n", vetC[i]);
  

  }


}







