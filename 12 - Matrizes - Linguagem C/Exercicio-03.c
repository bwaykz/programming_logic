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

  printf("*****************************\n");
  printf("* Programa Negativos Matriz *\n");
  printf("*****************************\n");

  printf("\n");

  printf("Qual a quantidade de linhas da matriz: \n");
  scanf("%d", &l);

  printf("Qual a quantidade de colunas da matriz: \n");
  scanf("%d", &c);

  printf("\n");

  for (i = 0 ;i < l ; i++) {
    for (j = 0; j < c ; j++) {

      printf("Elemento [%d,%d]:", i, j);
      scanf("%d", &matA[i][j]);

    }
  }

  printf("\n");

  printf("Valores Negativos: \n");

  for (i = 0 ; i < l ; i++) {
    for (j = 0 ; j < c ; j++) {
      if (matA[i][j] < 0) {

        printf("%d\n", matA[i][j]);
      
      }
    }
  }



}







