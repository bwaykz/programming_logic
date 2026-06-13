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
  
  int dis;
  double gas, med;

  printf("********************\n");
  printf("* Programa Consumo *\n");
  printf("********************\n");

  printf("\n");

  printf("Digite a distancia percorrida: \n");
  scanf("%d", &dis);

  printf("Digite o Combustivel gasto: \n");
  scanf("%lf", &gas);
  
  printf("\n");

  med = (double) dis / gas;

  printf("Consumo medio de combustivel foi: %.3lf", med);


  return 0;
}







