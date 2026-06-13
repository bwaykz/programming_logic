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
  
  int x, i, multi;

  printf("********************\n");
  printf("* Programa Tabuada *\n");
  printf("********************\n");

  printf("\n");

  printf("Deseja a tabuada para qual valor: ");
  scanf("%d", &x);

  for (i = 1; i < 10 ; i++) {
    multi = x * i;
    printf("%d x %d = %d", x, i, multi);
    printf("\n");
  }


}







