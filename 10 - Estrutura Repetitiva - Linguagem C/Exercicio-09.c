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

  int x, y, i, fora, dentro;

  printf("************************\n");
  printf("* Programa Dentro Fora *\n");
  printf("************************\n");

  printf("\n");

  printf("Quantos numeros voce vai digitar: \n");
  scanf("%d", &x);

  fora = 0;
  dentro = 0;

  for (i = 1 ; i <= x; i ++) {
    printf("Digite um numero: \n");
    scanf("%d", &y);
    
    if (y < 10 || y > 20 ) {
      fora = fora + 1;
    
    }else {
      dentro = dentro + 1;

    }

  }

  printf("%d Dentro\n", dentro);
  printf("%d Fora \n", fora);












}







