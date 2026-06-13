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

#include <stdio.h>

int main() {

  int n, quantidade;
  char tipo;

  // Inicializando todos os contadores com zero!
  int total_cobaias = 0;
  int total_coelhos = 0;
  int total_ratos = 0;
  int total_sapos = 0;

  double percentual_coelhos, percentual_ratos, percentual_sapos;

  // Cabeçalho enfeitado com asteriscos
  printf("**************************\n");
  printf("* Programa experiencias  *\n");
  printf("**************************\n\n");

  // Lendo a quantidade de repetições
  printf("Quantos casos de teste serao digitados? ");
  scanf("%d", &n);

  // Estrutura 'for': começa no 0, e repete enquanto 'i' for menor que 'n'
  for (int i = 0; i < n; i++) {
    printf("Quantidade de cobaias: ");
    scanf("%d", &quantidade);

    // DICA CRÍTICA: O espaço antes do %c para ignorar o 'Enter' invisível
    printf("Tipo de cobaia: ");
    scanf(" %c", &tipo);

    // Soma o total geral de cobaias
    total_cobaias = total_cobaias + quantidade;

    // Estrutura de decisão para somar no contador específico
    if (tipo == 'C' || tipo == 'c') {
      total_coelhos = total_coelhos + quantidade;
    } else if (tipo == 'R' || tipo == 'r') {
      total_ratos = total_ratos + quantidade;
    } else if (tipo == 'S' || tipo == 's') {
      total_sapos = total_sapos + quantidade;
    }
  }

  // Cálculos de percentual (multiplicamos por 100.0 para virar porcentagem)
  // Usamos (double) na frente para forçar o C a fazer uma divisão com decimais
  percentual_coelhos = ((double)total_coelhos / total_cobaias) * 100.0;
  percentual_ratos = ((double)total_ratos / total_cobaias) * 100.0;
  percentual_sapos = ((double)total_sapos / total_cobaias) * 100.0;

  // Relatório Final
  printf("\nRELATORIO FINAL:\n");
  printf("Total: %d cobaias\n", total_cobaias);
  printf("Total de coelhos: %d\n", total_coelhos);
  printf("Total de ratos: %d\n", total_ratos);
  printf("Total de sapos: %d\n", total_sapos);

  // Imprimindo com duas casas decimais
  printf("Percentual de coelhos: %.2lf\n", percentual_coelhos);
  printf("Percentual de ratos: %.2lf\n", percentual_ratos);
  printf("Percentual de sapos: %.2lf\n", percentual_sapos);

  return 0;
}
