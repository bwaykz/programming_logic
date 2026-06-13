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
    
    int n, linha_escolhida, coluna_escolhida;
    double soma_positivos = 0.0;

    // Cabeçalho enfeitado com asteriscos
    printf("*************************\n");
    printf("* Programa matriz_geral *\n");
    printf("*************************\n\n");

    printf("Qual a ordem da matriz? ");
    scanf("%d", &n);

    double matriz[n][n];

    // Leitura dos dados e já calculando a soma dos positivos (Ação a)
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%lf", &matriz[i][j]);
            
            // Se o número for maior que zero, acumula na soma
            if (matriz[i][j] > 0) {
                soma_positivos = soma_positivos + matriz[i][j];
            }
        }
    }

    printf("\nSOMA DOS POSITIVOS: %.1lf\n", soma_positivos);

    // Ação b: Ler e imprimir uma linha inteira
    printf("\nEscolha uma linha: ");
    scanf("%d", &linha_escolhida);
    printf("LINHA ESCOLHIDA: ");
    for (int j = 0; j < n; j++) {
        // A linha fica 'travada' na escolha do usuário, só a coluna (j) varia
        printf("%.1lf ", matriz[linha_escolhida][j]); 
    }
    printf("\n");

    // Ação c: Ler e imprimir uma coluna inteira
    printf("\nEscolha uma coluna: ");
    scanf("%d", &coluna_escolhida);
    printf("COLUNA ESCOLHIDA: ");
    for (int i = 0; i < n; i++) {
        // A coluna fica 'travada' na escolha do usuário, só a linha (i) varia
        printf("%.1lf ", matriz[i][coluna_escolhida]);
    }
    printf("\n");

    // Ação d: Imprimir a diagonal principal
    printf("\nDIAGONAL PRINCIPAL: ");
    for (int i = 0; i < n; i++) {
        // Na diagonal principal, a linha e a coluna são sempre iguais (0,0), (1,1)...
        printf("%.1lf ", matriz[i][i]);
    }
    printf("\n");

    // Ação e: Alterar os negativos para o quadrado e imprimir a matriz
    printf("\nMATRIZ ALTERADA:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            
            // Se for negativo, eleva ao quadrado
            if (matriz[i][j] < 0) {
                matriz[i][j] = (matriz[i][j], 2);
            }
            
            // Imprime o elemento (alterado ou não) com um espaço ao lado
            printf("%.1lf ", matriz[i][j]);
        }
        // Quebra a linha ao final de cada linha da matriz para desenhar o quadrado
        printf("\n");
    }

    return 0;
}







