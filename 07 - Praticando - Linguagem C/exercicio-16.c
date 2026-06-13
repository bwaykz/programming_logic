#include <stdio.h>
#include <string.h>

void limpar_entrada() {
  char c;
  while ((c = getchar()) != '\n' && c != EOF) {}
}


int main() {


  double c, f;
  char resp;

  printf("**********************************\n");
  printf("* Programa Temperatura/Conversao *\n");
  printf("**********************************\n");

  printf("\n");

  do {
    printf("Digite a temperatura em celsius: ");
    scanf("%lf", &c);
    f = 9.0 * c / 5.0 + 32;
    printf("Equivalente em fahrenheit: %.1lf \n", f);
    printf("Deseja repetir (s/n):\n");
    limpar_entrada();
    scanf("%c", &resp);



   }while ( resp == 's');


  return 0;
}
