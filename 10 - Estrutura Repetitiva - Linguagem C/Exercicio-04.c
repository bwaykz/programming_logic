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
    
    int x, y;

    // Cabeçalho enfeitado com asteriscos
    printf("***********************\n");
    printf("* Programa quadrante  *\n");
    printf("***********************\n\n");

    // Cria um loop infinito
    while (1) {
        printf("Digite os valores das coordenadas X e Y:\n");
        scanf("%d", &x);
        scanf("%d", &y);

        // Condição de parada: se X ou Y for igual a zero, quebra o loop
        if (x == 0 || y == 0) {
            break; 
        }

        // Verifica em qual quadrante o ponto está
        if (x > 0 && y > 0) {
            printf("QUADRANTE Q1\n");
        } else if (x < 0 && y > 0) {
            printf("QUADRANTE Q2\n");
        } else if (x < 0 && y < 0) {
            printf("QUADRANTE Q3\n");
        } else if (x > 0 && y < 0) {
            printf("QUADRANTE Q4\n");
        }
    }

    return 0;
}



