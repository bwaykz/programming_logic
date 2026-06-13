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

  int x, y;

  printf("Digite dois numeros: \n");
  scanf("%d", &x);
  scanf("%d", &y);

  if (x > y) {
    printf("Crecente!\n");
  } else {
    printf("Decrecente!\n");
  }

  while (x != y) {
    printf("Digite outros dois numeros: \n");
    scanf("%d", &x);
    scanf("%d", &y);

    if (x < y) {
      printf("Crecente!\n");
    } else {
      printf("Decrecente!\n");
    }
  }
}
