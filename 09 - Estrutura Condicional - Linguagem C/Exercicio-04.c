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

  int minutos;
  double valor_pagar = 50.00; // O valor base sempre começa em 50 Reais

  // Cabeçalho enfeitado com asteriscos
  printf("**********************\n");
  printf("* Programa operadora *\n");
  printf("**********************\n");
    
  printf("\n");

  // Entrada de dados
  printf("Digite a quantidade de minutos: ");
  scanf("%d", &minutos);

  // Verifica se os minutos ultrapassaram a franquia de 100
  if (minutos > 100) {
  // Calcula os minutos excedentes e multiplica por R$ 2.00
    valor_pagar = valor_pagar + ((minutos - 100) * 2.00);
  }

  // Saída formatada com 2 casas decimais (padrão para dinheiro)
  printf("Valor a pagar: R$ %.2lf\n", valor_pagar);

  return 0;

}







