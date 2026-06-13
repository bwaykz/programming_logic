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

  int x, i, y, soma;
  int vet[9];
  double media;

  printf("***********************\n");
  printf("* Programa Soma Vetor *\n");
  printf("***********************\n");

  printf("\n");

  printf("Quantos numeros voce vai digitar: \n");
  scanf("%d", &x);

  for (i = 0; i < x ; i++) {
  
    printf("Digite um numero: \n");
    scanf("%d", &vet[i]);

  }

  printf("\n");

  printf("Valores: ");

  for (i = 0; i < x ; i++) {

    printf("%d ", vet[i]);

  }

  printf("\n");


  soma = 0;

  for (i = 0 ; i < x ; i++) {

    soma = soma + vet[i];

  }

  printf("Soma = %d\n", soma);

  media = (double) soma / x;

  printf("Media = %.2lf\n", media);



  return 0 ;
}







