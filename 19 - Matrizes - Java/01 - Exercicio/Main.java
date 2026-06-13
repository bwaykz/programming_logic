import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int x, i, j, nega;

    System.out.println("*******************************");
    System.out.println("* Programa Diagonal Negativos *");
    System.out.println("*******************************");

    System.out.println();

    System.out.println("Qual a ordem da matriz: ");
    x = sc.nextInt();
    
    int[][] mat = new int[x][x];

    for ( i = 0 ; i < x ; i++ ) {
      for ( j = 0 ; j < x ; j++ ) {
        System.out.println("Elemento [" + i + "," + j + "]:");
        mat[i][j] = sc.nextInt();
      }
    }

    nega = 0;

    System.out.println();

    System.out.println("Diagonal principal: ");
    
    for ( i = 0 ; i < x ; i++ ) {
      for ( j = 0 ; j < x ; j++ ) {
        if (i == j) {
          System.out.println(mat[i][j]);
        }
        if (mat[i][j] < 0) {
          nega++;
        }
      }
    }


    if (nega > 0) {
      System.out.println("Quantida de negaticos = " + nega);
    }









  }
}
