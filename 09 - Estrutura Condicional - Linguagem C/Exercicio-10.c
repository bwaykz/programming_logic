#include <stdio.h>

int main() {
    
    int a, b;

    // Cabeçalho enfeitado com asteriscos
    printf("**********************\n");
    printf("* Programa multiplos *\n");
    printf("**********************\n");
    
    printf("\n");

    // Entrada de dados
    printf("Digite dois numeros inteiros:\n");
    scanf("%d", &a);
    scanf("%d", &b);

    // Verifica se A é múltiplo de B OU se B é múltiplo de A
    if (a % b == 0 || b % a == 0) {
        printf("Sao multiplos\n");
    } else {
        printf("Nao sao multiplos\n");
    }

    return 0;
}





