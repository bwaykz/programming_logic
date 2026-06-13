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
  int quan;
  double pre, din, tro, val;

  printf("*****************************\n");
  printf("* Programa Troco Verificado *\n");
  printf("*****************************\n");

  printf("");

  printf("Digite o preco unitario do produto: \n");
  scanf("%lf", &pre);

  printf("Digite a quantidade comprada: \n");
  scanf("%d", &quan);

  printf("Digite o dinheiro recebido: \n");
  scanf("%lf", &din);


  val = (double) (pre * quan);

  if (val < din) {

    tro = din - val;
    printf("Troco = %.2lf\n", tro);

  } else {

    tro = din - val;
    printf("Dinheiro Insuficiente! faltam %.2lf\n", tro);
  
  }


}







