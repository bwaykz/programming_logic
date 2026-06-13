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

  double x, y, z;

  printf("******************\n");
  printf("* Programa Dardo *\n");
  printf("******************\n");

  printf("\n");

  printf("Digite as tres distancias: \n");
  scanf("%lf", &x);
  scanf("%lf", &y);
  scanf("%lf", &z);

  if (x > y && x > z) {

    printf("Maior distancia = %.2lf", x);
  
  } else if (y > x && y > z) {

    printf("Maior distancia = %.2lf", y);
  
  } else {

    printf("Maior distancia = %.2lf", z);

  }


}







