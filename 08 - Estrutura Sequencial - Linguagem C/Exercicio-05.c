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

  double pre, uni, din, tro;

  printf("******************\n");
  printf("* Programa troco *\n");
  printf("******************\n");


  printf("\n");

  printf("Preco unitario do produto: \n");
  scanf("%lf", &pre);

  printf("Digite quantas unidades compradas: \n");
  scanf("%lf", &uni);

  printf("Digite o dinheiro recebido: ");
  scanf("%lf", &din);

  tro = (pre * uni) - din;

  printf("troco = %.2lf", tro);

}







