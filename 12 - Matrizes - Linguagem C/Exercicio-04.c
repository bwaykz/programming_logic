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
    printf("************************\n");
    printf("* Programa cada_linha  *\n");
    printf("************************\n\n");

    printf("Qual a ordem da matriz? ");
    scanf("%d", &n);

    // Criando a matriz quadrada de ordem 'n' (n linhas por n colunas)
    int matriz[n][n];

    // 1º Passo: Leitura dos dados usando loops aninhados (um dentro do outro)
    for (int i = 0; i < n; i++) {           // 'i' controla as LINHAS
        for (int j = 0; j < n; j++) {       // 'j' controla as COLUNAS
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d", &matriz[i][j]);
        }
    }

    printf("MAIOR ELEMENTO DE CADA LINHA:\n");

    // 2º Passo: Encontrar o maior elemento de cada linha
    for (int i = 0; i < n; i++) {
        // Estratégia do campeão: assume que o 1º elemento da linha atual é o maior
        int maior = matriz[i][0]; 
        
        // Varre o resto das colunas dessa mesma linha para comparar
        for (int j = 1; j < n; j++) {
            if (matriz[i][j] > maior) {
                maior = matriz[i][j]; // Atualiza o maior se encontrar alguém superior
            }
        }
        
        // Imprime o maior valor da linha atual antes de passar para a próxima linha
        printf("%d\n", maior);
    }

    return 0;
}
