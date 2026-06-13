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

  double A, B, C;
  double area_quadrado, area_triangulo, area_trapezio;

  // Cabeçalho enfeitado com asteriscos
  printf("********************\n");
  printf("* Programa medidas *\n");
  printf("********************\n");
    
  printf("\n");

    // Entrada de dados
  printf("Digite a medida A: ");
  scanf("%lf", &A);
    
  printf("Digite a medida B: ");
  scanf("%lf", &B);
    
  printf("Digite a medida C: ");
  scanf("%lf", &C);

    // Cálculos
  area_quadrado = A * A;
  area_triangulo = (A * B) / 2.0;
  area_trapezio = ((A + B) * C) / 2.0;

    // Saídas formatadas com 4 casas decimais
  printf("AREA DO QUADRADO = %.4lf\n", area_quadrado);
  printf("AREA DO TRIANGULO = %.4lf\n", area_triangulo);
  printf("AREA DO TRAPEZIO = %.4lf\n", area_trapezio);

  return 0;

}







