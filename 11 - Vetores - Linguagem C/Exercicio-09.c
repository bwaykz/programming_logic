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


#include <stdio.h>

int main() {
    
    int n;

    // Cabeçalho enfeitado com asteriscos
    printf("**************************\n");
    printf("* Programa media_pares   *\n");
    printf("**************************\n\n");

    printf("Quantos elementos vai ter o vetor? ");
    scanf("%d", &n);

    // Criando o vetor de números inteiros com tamanho 'n'
    int vetor[n];
    
    // Inicializando o somador e o contador dos números pares
    int soma_pares = 0;
    int cont_pares = 0;

    // Loop para leitura dos dados
    for (int i = 0; i < n; i++) {
        printf("Digite um numero: ");
        scanf("%d", &vetor[i]);
    }

    // Loop para processar os dados do vetor
    for (int i = 0; i < n; i++) {
        // Olha a linha que você me perguntou aqui!
        if (vetor[i] % 2 == 0) {
            soma_pares = soma_pares + vetor[i]; // Acumula a soma dos pares
            cont_pares++;                       // Conta quantos pares foram encontrados
        }
    }

    // Verificação final
    if (cont_pares == 0) {
        printf("NENHUM NUMERO PAR\n");
    } else {
        // Fazemos o cast para (double) para não perder as casas decimais na divisão
        double media = (double)soma_pares / cont_pares;
        printf("MEDIA DOS PARES = %.1lf\n", media);
    }

    return 0;
}
