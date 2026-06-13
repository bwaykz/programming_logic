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
    printf("*****************************\n");
    printf("* Programa zona_de_impacto  *\n");
    printf("*****************************\n\n");

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

    // 2º Passo: Lendo as coordenadas do alvo
    int linha_alvo, coluna_alvo, raio;
    
    printf("\nDigite a linha do impacto: ");
    scanf("%d", &linha_alvo);
    
    printf("Digite a coluna do impacto: ");
    scanf("%d", &coluna_alvo);
    
    printf("Digite o raio de impacto: ");
    scanf("%d", &raio);

    // 3º Passo: Calculando os limites da explosão
    int inicio_linha = linha_alvo - raio;
    int fim_linha = linha_alvo + raio;
    
    int inicio_coluna = coluna_alvo - raio;
    int fim_coluna = coluna_alvo + raio;

    // 4º Passo: A Trava de Segurança (Evitando o Segmentation Fault)
    // Se a explosão tentar ir para antes da linha 0, travamos no 0.
    if (inicio_linha < 0) inicio_linha = 0;
    
    // Se tentar passar da última linha (n - 1), travamos na última linha.
    if (fim_linha >= n) fim_linha = n - 1;
    
    // Mesma lógica de proteção para as colunas
    if (inicio_coluna < 0) inicio_coluna = 0;
    if (fim_coluna >= n) fim_coluna = n - 1;

    // 5º Passo: Somar os elementos contidos APENAS dentro dos limites seguros
    int soma_impacto = 0;
    
    // Repare que os loops agora não vão de 0 até 'n', 
    // eles vão apenas da linha inicial até a linha final calculadas!
    for (int i = inicio_linha; i <= fim_linha; i++) {
        for (int j = inicio_coluna; j <= fim_coluna; j++) {
            soma_impacto = soma_impacto + matriz[i][j];
        }
    }

    // Saída do resultado
    printf("\nSOMA DA ZONA DE IMPACTO = %d\n", soma_impacto);

    return 0;
}
