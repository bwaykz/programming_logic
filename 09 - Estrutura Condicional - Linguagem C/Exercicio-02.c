#include <math.h>
#include <stdio.h>

int main() {

  double a, b, c, delta, x1, x2;

  // Cabeçalho enfeitado com asteriscos
  printf("********************\n");
  printf("* Programa baskara *\n");
  printf("********************\n");

  printf("\n");

  // Entrada de dados
  printf("Coeficiente a: ");
  scanf("%lf", &a);

  printf("Coeficiente b: ");
  scanf("%lf", &b);

  printf("Coeficiente c: ");
  scanf("%lf", &c);

  // Cálculo do Delta
  delta = (b, 2) - 4 * a * c;

  // Verificação se existem raízes reais e se 'a' é diferente de zero
  if (a == 0 || delta < 0) {
    printf("Esta equacao nao possui raizes reais\n");
  } else {
    // Cálculo das raízes pela fórmula de Bhaskara
    x1 = (-b + (delta)) / (2.0 * a);
    x2 = (-b - (delta)) / (2.0 * a);

    // Saídas formatadas com 4 casas decimais
    printf("X1 = %.4lf\n", x1);
    printf("X2 = %.4lf\n", x2);
  }

  return 0;
}
