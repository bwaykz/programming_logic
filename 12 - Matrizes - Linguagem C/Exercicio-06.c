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
    int soma = 0;

    // Cabeçalho enfeitado com asteriscos
    printf("***************************\n");
    printf("* Programa acima_diagonal *\n");
    printf("***************************\n\n");

    printf("Qual a ordem da matriz? ");
    scanf("%d", &n);

    int matriz[n][n];

    // 1º Passo: Leitura de todos os dados da matriz
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d", &matriz[i][j]);
        }
    }

    // 2º Passo: Somar apenas os elementos ACIMA da diagonal principal
    for (int i = 0; i < n; i++) {
        // O pulo do gato está nesta linha abaixo: 'j' começa valendo 'i + 1'
        for (int j = i + 1; j < n; j++) {
            soma = soma + matriz[i][j];
        }
    }

    // Saída do resultado
    printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d\n", soma);

    return 0;
}





