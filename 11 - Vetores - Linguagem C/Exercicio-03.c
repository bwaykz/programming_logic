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
    printf("********************\n");
    printf("* Programa alturas *\n");
    printf("********************\n\n");

    printf("Quantas pessoas serao digitadas? ");
    scanf("%d", &n);

    // Criando os Vetores (Arrays) com o tamanho 'n' que o usuário acabou de digitar
    char nomes[n][50]; // Uma lista de 'n' nomes, onde cada nome pode ter até 50 letras
    int idades[n];     // Uma lista de 'n' idades
    double alturas[n]; // Uma lista de 'n' alturas

    // Variáveis para os cálculos
    double soma_alturas = 0.0;
    int menores_de_16 = 0;

    // 1º Loop: Leitura dos dados
    for (int i = 0; i < n; i++) {
        printf("Dados da %da pessoa:\n", i + 1);
        
        printf("Nome: ");
        // O espaço antes do % no scanf é um truque mágico do C para limpar o 
        // buffer e não pular a leitura do nome por causa do 'Enter' anterior!
        scanf(" %[^\n]", nomes[i]); 
        
        printf("Idade: ");
        scanf("%d", &idades[i]);
        
        printf("Altura: ");
        scanf("%lf", &alturas[i]);
    }

    // 2º Loop: Processamento dos cálculos
    for (int i = 0; i < n; i++) {
        soma_alturas = soma_alturas + alturas[i];
        
        if (idades[i] < 16) {
            menores_de_16++;
        }
    }

    // Calculando média e porcentagem
    double altura_media = soma_alturas / n;
    double percentual_menores = ((double)menores_de_16 / n) * 100.0;

    // Saídas
    printf("\nAltura media: %.2lf\n", altura_media);
    
    // Para imprimir o símbolo de % no printf, precisamos digitar %%
    printf("Pessoas com menos de 16 anos: %.1lf%%\n", percentual_menores);

    // 3º Loop: Varrendo a lista de novo só para imprimir os nomes dos menores
    for (int i = 0; i < n; i++) {
        if (idades[i] < 16) {
            printf("%s\n", nomes[i]);
        }
    }

    return 0;
}







