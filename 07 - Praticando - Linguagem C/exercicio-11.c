#include <stdio.h>
#include <string.h>





void limpar_entrada () {
  char c; 
  while((c = getchar()) != '\n' && c != EOF) {}
}

void ler_texto(char *buffer, int length) {
fgets(buffer, length, stdin);
strtok(buffer, "\n");
}


int main() {

  int idade;
  double salario, altura;
  char genero;
  char nome[50];

  printf("********************\n");
  printf("* Programa salario *\n");
  printf("********************\n");

 
  printf("Digite o valor da idade: \n");
  scanf("%d", &idade);

  printf("Digite o Salario: \n");
  scanf("%2.lf", &salario);

  printf("Digit a altura: \n");
  scanf("%2.lf", &altura);
  
  limpar_entrada();
  //printf("Digite o Genero (F/M):\n")
  //scanf("%s\n", &genero);

  printf("Digite o nome: \n");
  fgets(nome, sizeof(nome), stdin);

  printf(" ");

  printf("Idade = %d\n", idade);
  printf("Salario = %2.fl\n", salario);
  printf("Altura = %fl\n", altura);
  //printf("Genero =  %c\n", genero);
  printf("Nome =  %s\n", nome); 

  return 0;
}
