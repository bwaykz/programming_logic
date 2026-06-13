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

  double gli;

  printf("********************\n");
  printf("* Programa Glicose *\n");
  printf("********************\n");

  printf("\n");

  printf("Digite A medida da glicose: \n");
  scanf("%lf", &gli);

  if (gli < 100) {
  
    printf("Classificaçao: normal");

  } else if ( gli <= 140) {

    printf("Classificaçao: eleveado");

  } else {

    printf("Classificaçao: Diabetes");

  }









}







