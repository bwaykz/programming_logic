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

  char nome[50];
  double va, ho, paga;


  printf("**********************\n");
  printf("* Programa Pagamento *\n");
  printf("**********************\n");

  printf("\n");

  printf("Digite o nome do funcionario: \n");
  read_text(nome, 50);
  
  printf("Digite o valor da hora: \n");
  clear_entry();
  scanf("%lf", &va);

  printf("Horas Trabalhadas: ");
  scanf("%lf", &ho);

  paga = va * ho;
  
  printf("O pagamento para %s deve ser R$: %.2lf", nome, paga);

}







