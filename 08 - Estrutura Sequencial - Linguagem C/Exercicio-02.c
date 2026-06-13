#include <stdio.h>
#include <string.h>
#include <math.h>

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

    double base, altura, area, perimetro, diagonal;
  
    
    // Leitura dos dados de entrada
    printf("Base do retangulo: ");
    scanf("%lf", &base);
    
    clear_entry();
    printf("Altura do retangulo: ");
    scanf("%lf", &altura);

    // Cálculos
    area = base * altura;
    perimetro = 2 * (base + altura);
    diagonal = sqrt(pow(base, 2) + pow(altura, 2));

    // Exibição dos resultados com 4 casas decimais
    printf("AREA = %.4lf\n", area);
    printf("PERIMETRO = %.4lf\n", perimetro);
    printf("DIAGONAL = %.4lf\n", diagonal);

    return 0;
}









