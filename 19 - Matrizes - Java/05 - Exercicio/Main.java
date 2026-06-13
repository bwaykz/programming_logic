import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int l, c, i, j;

    System.out.println("**************************");
    System.out.println("* Programa Soma Matrizes *");
    System.out.println("**************************");

    System.out.println();

    System.out.println("Quantas linhas vai ter cada matriz: ");
    l = sc.nextInt();

    System.out.println("Quantas colunas vai ter cada matriz: ");
    c = sc.nextInt();

    System.out.println();

    int[][] matA = new int[l][c];
    int[][] matB = new int[l][c];
    int[][] matC = new int[l][c];

    System.out.println("Digite os valores da matriz A:");

    for ( i = 0 ; i < l ; i++ ) {
      for ( j = 0 ; j < c ; j++ ) {
        System.out.println("Elemento [" + i + "," + j + "]: ");
        matA[i][j] = sc.nextInt();
      }
    }

    System.out.println("Digite os valores da matriz B:");

    
    for ( i = 0 ; i < l ; i++ ) {
      for ( j = 0 ; j < c ; j++ ) {
        System.out.println("Elemento [" + i + "," + j + "]:");
        matB[i][j] = sc.nextInt();
      }
    }



    for ( i = 0 ; i < l ; i++) {
      for ( j = 0 ; j < c ; j++ ) {
        matC[i][j] = matB[i][j] + matA[i][j];
      }
    }

    System.out.println("Matriz Soma:");


    for ( i = 0 ; i < l ; i++ ) {
      for ( j = 0 ; j < c ; j++ ) {
        System.out.print(matC[i][j] + " ");
      }
      System.out.println();
    }




    sc.close();
  }
}
