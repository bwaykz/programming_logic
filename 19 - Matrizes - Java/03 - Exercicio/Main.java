import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);

    int l, c, i, j;

    System.out.println("*****************************");
    System.out.println("* Programa negativos matriz *");
    System.out.println("*****************************");

    System.out.println();

    System.out.println("Digite a quantidade de linhas da matriz: ");
    l = sc.nextInt();

    System.out.println("Digite a quantidade de colunas da matriz: ");
    c = sc.nextInt();

    int[][] mat = new int [l][c];

    for ( i = 0 ; i < l ; i++ ) {
      for ( j = 0 ; j < c ; j++ ) {
        System.out.println("Elemento [" + i + "," + j + "]:");
        mat[i][j] = sc.nextInt();
      }
    }
    
    System.out.println();

    System.out.println("Valores negativos:");

    for ( i = 0 ; i < l ; i++ ) {
      for ( j = 0 ; j < c ; j++ ) {
        if (mat[i][j] < 0) {
          System.out.println(mat[i][j]);
        }
      }
    }




    sc.close();
  }
}
