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
    
    int n;

    // Cabeçalho enfeitado com asteriscos
    printf("**************************\n");
    printf("* Programa maior_posicao *\n");
    printf("**************************\n\n");

    printf("Quanto numeros voce vai digitar? ");
    scanf("%d", &n);

    // Criando o vetor de números reais (double) com tamanho 'n'
    double vetor[n];

    // Loop para leitura dos dados
    for (int i = 0; i < n; i++) {
        printf("Digite um numero: ");
        scanf("%lf", &vetor[i]);
    }

    // Estratégia para encontrar o maior e a posição:
    // Começamos assumindo que o primeiro elemento (índice 0) é o maior de todos
    double maior = vetor[0];
    int posicao_maior = 0;

    // Varremos o vetor a partir do segundo elemento (índice 1) para comparar
    for (int i = 1; i < n; i++) {
        if (vetor[i] > maior) {
            maior = vetor[i];      // Atualiza o maior valor encontrado
            posicao_maior = i;     // Salva o índice de onde ele estava
        }
    }

    // Exibição dos resultados conforme o exemplo (.1lf para mostrar uma casa decimal)
    printf("\nMAIOR VALOR = %.1lf\n", maior);
    printf("POSICAO DO MAIOR VALOR = %d\n", posicao_maior);

    return 0;
}







