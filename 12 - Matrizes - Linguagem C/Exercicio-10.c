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
    
    int m, n;
    int cont_negativos = 0;

    // Cabeçalho enfeitado com asteriscos
    printf("******************************\n");
    printf("* Programa negativos_matriz  *\n");
    printf("******************************\n\n");

    // Lendo o tamanho das linhas e colunas de forma separada
    printf("Quantidade de linhas da matriz: ");
    scanf("%d", &m);
    
    printf("Quantidade de colunas da matriz: ");
    scanf("%d", &n);

    // Criando a matriz retangular [linhas][colunas]
    int matriz[m][n];

    // 1º Passo: Leitura de todos os dados
    // Perceba que o loop de fora vai até 'm' e o de dentro vai até 'n'
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d", &matriz[i][j]);
        }
    }

    printf("\nVALORES NEGATIVOS:\n");

    // 2º Passo: Varredura para encontrar, imprimir e contar os negativos
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            
            // O teste lógico mais simples possível: é menor que zero?
            if (matriz[i][j] < 0) {
                printf("%d\n", matriz[i][j]);
                cont_negativos++; // Adiciona +1 no nosso contador
            }
            
        }
    }

    // Saída final
    printf("\nQUANTIDADE DE NEGATIVOS = %d\n", cont_negativos);

    return 0;
}







