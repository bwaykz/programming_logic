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
    int soma_bordas = 0;

    // Cabeçalho enfeitado com asteriscos
    printf("***************************\n");
    printf("* Programa bordas_matriz  *\n");
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

    // 2º Passo: Vasculhar a matriz procurando quem está na borda
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            
            // O teste lógico: Se for a primeira/última linha OU primeira/última coluna
            if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                soma_bordas = soma_bordas + matriz[i][j];
            }
            
        }
    }

    // Saída do resultado
    printf("\nSOMA DAS BORDAS = %d\n", soma_bordas);

    return 0;
}







