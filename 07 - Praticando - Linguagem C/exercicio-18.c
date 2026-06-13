#include <stdio.h>
#include <string.h>

void limpar_entrada() {
char c;
while ((c = getchar()) != '\n' && c != EOF) {} 
}


int main () {

  int l, c, i, j;
  
  printf("Quantas linhas vai ter a matriz:\n");
  scanf("%d", &l);

  printf("Quantas colunas vai ter a matriz:\n");
  limpar_entrada();
  scanf("%d", &c);

  int mat[l][c];

  for (i = 0; i < l ; i++) {
    for (j = 0; j < c ; j++) {
      printf("Elemento [%d,%d]: ", i, j);
      limpar_entrada();
      scanf("%d", &mat[i][j]);
    }
  }

  printf("Elementos digitados: ");

  for (i = 0 ; i < l ; i++) {
    for (j = 0; j < c ; j ++) {
      printf("%d  ", mat[i][j]);
    }
    printf(" \n");
  }



  return 0 ;
}
