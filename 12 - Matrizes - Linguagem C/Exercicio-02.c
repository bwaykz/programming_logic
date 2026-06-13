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

  int l, c, i, j, soma;
  int matA[9][9];
  // int matB[9][9];

  printf("************************\n");
  printf("* Programa Soma Linhas *\n");
  printf("************************\n");

  printf("\n");

  printf("Qual a quantidade de linhas da matriz: \n");
  scanf("%d", &l);

  printf("Qual a quantidade de colunas da matriz: \n");
  scanf("%d", &c);

  printf("\n");

  for (i = 0; i < l; i++) {
    printf("Digite os elementos da %d linha\n", i);
    for (j = 0; j < c; j++) {

      scanf("%d", &matA[i][j]);
    }
  }

  printf("Vetor gerado:\n");

  for (i = 0; i < l; i++) {
    soma = 0;
    for (j = 0; j < c; j++) {
      soma = matA[i][j] + soma;
    }
    printf("%d ", soma);
  }


  return 0;
}
