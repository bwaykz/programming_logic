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

  int duracao_total, horas, minutos, segundos, resto;

    // Cabeçalho enfeitado com asteriscos
  printf("********************\n");
  printf("* Programa duracao *\n");
  printf("********************\n");
    
  printf("\n");

  // Entrada de dados
  printf("Digite a duracao em segundos: ");
  scanf("%d", &duracao_total);

  // Cálculos
  horas = duracao_total / 3600;
  resto = duracao_total % 3600;
    
  minutos = resto / 60;
  segundos = resto % 60;

    // Saída no formato horas:minutos:segundos
  printf("%d:%d:%d\n", horas, minutos, segundos);

  return 0;
  
}







