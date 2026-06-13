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

  double lar, comp, val;
  double area, preco;
  
  printf("********************\n");
  printf("* Programa Terreno *\n");
  printf("********************\n");

  printf(" \n");

  printf("Digite a largura do terreno: \n");
  scanf("%lf", &lar);

  printf("Digite o comprimento do terreno: \n");
  clear_entry();
  scanf("%lf", &comp);


  printf("Digite o valor do metro quadrado\n");
  clear_entry();
  scanf("%lf", &val);

  printf("\n");

  area = lar * comp;
  preco = val * area;

  printf("\n");

  printf("Largura do terreno: %.2lf\n", area);
  printf("Preco do terreno: %.2lf", preco);


}







