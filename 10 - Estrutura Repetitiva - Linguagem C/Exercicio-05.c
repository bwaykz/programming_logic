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

  double nt1, nt2, media;

  printf("******************************\n");
  printf("* Programa Validaçao de nota *\n");
  printf("******************************\n");

  printf("\n");

  printf("Digite a primeira nota: \n");
  scanf("%lf", &nt1);

  while (nt1 < 0 || nt1 > 10) {
    printf("Valor invalido! Tente Novamente\n");
    scanf("%lf", &nt1);
  }

  printf("Digite a Segunda nota: \n");
  scanf("%lf", &nt2);

  while (nt2 < 0.0 || nt2 > 10.0) {
    printf("Valor invalido! Tente Novamente\n");
    scanf("%lf", &nt2);
  }

  media = (nt1 + nt2) /2;

  printf("Media = %.1lf\n", media);









}







