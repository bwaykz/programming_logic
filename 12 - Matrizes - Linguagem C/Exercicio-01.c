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

  int x, i, j, cont;
  int matA[9][9];

  printf("******************************\n");
  printf("* Programa Diagonal Negativa *\n");
  printf("******************************\n");

  printf("\n");

  printf("Qual a ordem da matriz\n");
  scanf("%d", &x);

  for (i = 0 ;i < x ; i++) {
    for (j = 0; j < x; j++) {

      printf("Elemento [%d,%d]\n", i, j);
      scanf("%d", &matA[i][j]);

    }
  }

  cont = 0;

  for (i = 0; i < x ; i++) {
    for (j = 0; j < x ; j++) {
    
      if (matA[i][j] < 0) {
        cont = cont + 1;
      
      }


    }
  }

  printf("\n");

  printf("Quantidade de negativos = %d\n", cont);


}
