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
    
    int x, soma;

    // Cabeçalho enfeitado com asteriscos
    printf("*********************************\n");
    printf("* Programa pares consecutivos *\n");
    printf("*********************************\n\n");

    while (1) {
        printf("Digite um numero inteiro: ");
        scanf("%d", &x);

        // Condição de parada: se X for zero, encerra o programa imediatamente
        if (x == 0) {
            break;
        }

        // Se o número for ímpar, somamos 1 para ele virar o próximo par
        if (x % 2 != 0) {
            x++; // Equivalente a x = x + 1;
        }

        // Como sabemos que o 'x' agora é par, basta somar ele e os próximos 4 pares
        soma = x + (x + 2) + (x + 4) + (x + 6) + (x + 8);

        // Exibe o resultado
        printf("SOMA = %d\n", soma);
    }

    return 0;
}
