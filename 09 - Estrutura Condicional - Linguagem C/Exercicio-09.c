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
  
  int x, quan;
  double paga;

  printf("***********************\n");
  printf("* Programa Lanchonete *\n");
  printf("***********************\n");

  printf("\n");
  
  x = 0;
  quan = 0; 

  printf("Digite o codigo do produto: \n");
  scanf("%d", &x);
  printf("Digite a quantidade de produto: \n");
  scanf("%d", &quan);

  paga = 0;

  switch (x) {
    case 1 :
      paga = (double) 5.00 * quan;
      break;
    case 2 :
      paga = (double) 3.50 * quan;
      break;
    case 3 :
      paga = (double) 4.80 * quan;
      break;
    case 4 :
      paga = (double) 8.90 * quan;
      break;
    case 5 :
      paga = (double) 7.32 * quan;
      break;
  }

  printf("Valor a pagar R$: %.2lf", paga);






}







