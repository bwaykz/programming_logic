#include <stdio.h>

int main() {
    
    char escala;
    double temperatura, equivalente;

    // Cabeçalho enfeitado com asteriscos
    printf("************************\n");
    printf("* Programa temperatura *\n");
    printf("************************\n");
    
    printf("\n");

    // Entrada da escala (C ou F)
    // DICA: O espaço antes do %c no scanf é muito importante!
    printf("Voce vai digitar a temperatura em qual escala (C/F)? ");
    scanf(" %c", &escala);

    // Estrutura condicional para decidir qual cálculo fazer
    if (escala == 'F' || escala == 'f') {
        printf("Digite a temperatura em Fahrenheit: ");
        scanf("%lf", &temperatura);
        
        // Convertendo de Fahrenheit para Celsius
        equivalente = (5.0 / 9.0) * (temperatura - 32.0);
        
        printf("Temperatura equivalente em Celsius: %.2lf\n", equivalente);
        
    } else if (escala == 'C' || escala == 'c') {
        printf("Digite a temperatura em Celsius: ");
        scanf("%lf", &temperatura);
        
        // Convertendo de Celsius para Fahrenheit
        equivalente = (temperatura * 9.0 / 5.0) + 32.0;
        
        printf("Temperatura equivalente em Fahrenheit: %.2lf\n", equivalente);
        
    } else {
        printf("Escala invalida. Por favor, digite C ou F.\n");
    }

    return 0;
}
