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
  
  int hora;

  printf("************************\n");
  printf("* Programa Hora do dia *\n");
  printf("************************\n");

  printf("\n");

  printf("Digite uma hora do dia: \n");
  scanf("%d", &hora);

  if (hora < 12) {
    printf("Bom dia!");
  }
  else if (hora < 18) {
    printf("Boa Tarde!");
  }
  else {
    printf("Boa Noite!");
  }
  

  return 0;
}
