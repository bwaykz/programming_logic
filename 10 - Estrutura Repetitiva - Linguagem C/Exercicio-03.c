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

  int senha1, senha2;

  senha1 = 2002;

  printf("***********************\n");
  printf("* Programa Senha Fixa *\n");
  printf("***********************\n");

  printf("\n");


  printf("Digite a senha: \n");
  scanf("%d", &senha2);

  if (senha2 != senha1) {

    printf("Senha Invalida! Tente Novamente \n");
    scanf("%d", &senha2);
  
  }

  while (senha2 != senha1) {

    printf("\n");

    if (senha2 != senha1) {
      printf("Senha Invalida! Tente Novamente \n");
      scanf("%d", &senha2);
    }
  }
  printf("Acesso Permitido\n");

}
