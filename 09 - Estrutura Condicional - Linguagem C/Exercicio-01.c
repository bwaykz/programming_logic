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

  double nt1, nt2, ntf;

  printf("*****************************\n");
  printf("* Programa Aprovado/Reprovado *");
  printf("*****************************\n");


  printf("\n");

  printf("Digite a primeira nota: \n");
  scanf("%lf", &nt1);

  printf("Digite a segunda nota: \n");
  scanf("%lf", &nt2);
  
  printf("\n");
  
  ntf = nt1 + nt2;

  if (ntf >= 60) {
    
    printf("Nota final = %.1lf\n", ntf);
    printf("Aprovado!\n");
  
  } else {
  
    printf("Nota final = %.1lf\n", ntf);
    printf("Reprovado!\n");

  }


  return 0;
}







