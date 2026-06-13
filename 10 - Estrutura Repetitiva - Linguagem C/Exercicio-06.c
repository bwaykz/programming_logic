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
    
    int codigo;
    
    // É obrigatório inicializar os contadores com zero!
    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;

    // Cabeçalho enfeitado com asteriscos
    printf("************************\n");
    printf("* Programa combustivel *\n");
    printf("************************\n\n");

    // Loop infinito para continuar pedindo o código
    while (1) {
        printf("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        scanf("%d", &codigo);

        if (codigo == 1) {
            alcool++;      // Adiciona +1 na contagem do Álcool
        } else if (codigo == 2) {
            gasolina++;    // Adiciona +1 na contagem da Gasolina
        } else if (codigo == 3) {
            diesel++;      // Adiciona +1 na contagem do Diesel
        } else if (codigo == 4) {
            break;         // Quebra o loop e vai para os resultados finais
        }
        
        // Se o usuário digitar 5, 8, 99 (qualquer coisa fora do 1 ao 4),
        // o programa não entra em nenhum 'if' e simplesmente repete o loop.
    }

    // Saída dos dados após o loop ser quebrado pelo 'break'
    printf("MUITO OBRIGADO\n");
    printf("Alcool: %d\n", alcool);
    printf("Gasolina: %d\n", gasolina);
    printf("Diesel: %d\n", diesel);

    return 0;
}
