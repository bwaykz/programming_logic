#include <stdio.h>
#include <string.h>
#include <math.h>


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

  char name1[50];
  char name2[50];
  int idade1, idade2;
  double media;

  printf("*******************\n");
  printf("* Programa idades *\n");
  printf("*******************\n");

  printf("\n");

  printf("Dados da primeira pessoa: \n");
  printf("Nome: \n");
  read_text(name1, 50);
  printf("idade: \n");
  scanf("%d", &idade1);
  clear_entry();
  printf("Dados da segunda pessoa: \n");
  printf("nome: \n");
  read_text(name2, 50);
  clear_entry();
  printf("Idade: \n");
  scanf("%d", &idade2);
  
  media = (double) (idade1 + idade2) / 2;

  printf("A idade media de %s e %s eh de %.1lf \n", name1, name2, media);

}







