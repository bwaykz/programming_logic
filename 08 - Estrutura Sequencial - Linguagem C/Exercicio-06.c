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

  double raio, area;

  // Cabeçalho enfeitado com asteriscos
  printf("********************\n");
  printf("* Programa circulo *\n");
  printf("********************\n");
    
  printf("\n");

  // Entrada de dados
  printf("Digite o valor do raio do circulo: ");
  scanf("%lf", &raio);

  // Cálculo da área usando 3.14159 como o exercício sugeriu
  area = 3.14159 * (raio, 2);

  // Saída formatada com 3 casas decimais
  printf("AREA = %.3lf\n", area);



}







