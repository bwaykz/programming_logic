import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int c, l, i, j;

    System.out.println("Quantas linhas vai ter a matriz: ");
    l = sc.nextInt();

    System.out.println("Quantas colunas vai ter a matriz: ");
    c = sc.nextInt();

    int[][] mat = new int [l][c];

    for (i = 0; i < l; i++) {
      for (j = 0; j < c ; j++){

        System.out.println("Elemento [" + i + "," + j + "]");
        mat[i][j] = sc.nextInt();


      }
    }

    
    System.out.println(" ");
    System.out.println("Matriz Digitada: ");

    for (i = 0; i < l; i++) {
      for (j = 0; j < c; j++) {

        System.out.print(mat[i][j] + " ");

      }
      System.out.println();
    }





  }
}
