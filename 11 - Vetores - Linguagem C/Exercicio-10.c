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
    printf("************************\n");
    printf("* Programa aprovados   *\n");
    printf("************************\n\n");

    printf("Quantos alunos serao digitados? ");
    scanf("%d", &n);

    // Criando os três vetores necessários com o tamanho 'n'
    char nomes[n][50]; // Vetor de textos (até 50 caracteres por nome)
    double notas1[n];  // Vetor para as notas do 1º semestre
    double notas2[n];  // Vetor para as notas do 2º semestre

    // 1º Loop: Leitura dos dados de todos os alunos
    for (int i = 0; i < n; i++) {
        printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
        
        // Lendo o nome (com espaço para limpar o buffer e [^\n] para ler nomes compostos)
        scanf(" %[^\n]", nomes[i]); 
        
        // Lendo as duas notas
        scanf("%lf", &notas1[i]);
        scanf("%lf", &notas2[i]);
    }

    // 2º Loop: Cálculo da média e verificação de aprovação
    printf("Alunos aprovados:\n");
    for (int i = 0; i < n; i++) {
        // Calcula a média do aluno atual
        double media = (notas1[i] + notas2[i]) / 2.0;
        
        // Se a média for maior ou igual a 6.0, imprime o nome correspondente
        if (media >= 6.0) {
            printf("%s\n", nomes[i]);
        }
    }

    return 0;
}
