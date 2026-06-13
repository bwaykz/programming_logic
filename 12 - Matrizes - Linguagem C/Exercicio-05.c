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

  int l, c, i, j;
  int matA[9][9];
  int matB[9][9];
  int soma[9][9];

  printf("****************************\n");
  printf("* Programa Soma Matrizes 2 *\n");
  printf("****************************\n");

  printf("\n");

  printf("Quantas linhas vai ter cada matriz: \n");
  scanf("%d", &l);

  printf("Quantas colunas vai ter cada matriz: \n");
  scanf("%d", &c);

  printf("\n");

  printf("Digite os valores da matriz A\n");

  for (i = 0; i < l; i++) {
    for (j = 0; j < c; j++) {
      printf("Elemento [%d,%d]", i, j);
      scanf("%d", &matA[i][j]);
    }
  }

  printf("\n");

  printf("Digite os valores da matriz B\n");

  for (i = 0; i < l; i++) {
    for (j = 0; j < c; j++) {
      printf("Elemento [%d,%d]", i, j);
      scanf("%d", &matB[i][j]);
    }
  }

  printf("\n");

  printf("Matriz soma: \n");

  for (i = 0; i < l; i++) {
    for (j = 0; j < c; j++) {
      soma[i][j] = matA[i][j] + matB[i][j];
      printf("%d ", soma[i][j]);
    }
    printf("\n");
  }



}







