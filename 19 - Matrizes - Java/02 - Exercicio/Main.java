import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    int l, c, i, j;

    System.out.println("************************");
    System.out.println("* Programa Soma Linhas *");
    System.out.println("************************");

    System.out.println();

    System.out.println("Qual a quantidade de linha da matriz: ");
    l = sc.nextInt();

    System.out.println("Qual a quantidade de colunas da matriz: ");
    c = sc.nextInt();

    double[][] mat = new double[l][c];

    for( i = 0 ; i < l ; i++ ) {
      System.out.println("Digite os elementos da " + i + "a. linha:");
      for( j = 0 ; j < c ; j++ ){
        System.out.println("Elemento [" + i + "," + j +"]:");
        mat[i][j] = sc.nextDouble();
      }
    }
    
    double[] vet = new double[l];


    System.out.println();

    System.out.println("Vetor gerado: ");


    for ( i = 0 ; i < l ; i++ ) {
      for ( j = 0 ; j < c ; j++ ){
        vet[i] = vet[i] + mat[i][j];
      }
      System.out.println(vet[i]);
    }


  }
}
