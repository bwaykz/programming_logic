import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int x, i ;

    System.out.println("*************************");
    System.out.println("* Programa soma vetores *");
    System.out.println("*************************");

    System.out.println();

    System.out.println("Quantos valores vai ter cada vetor: ");
    x = sc.nextInt();

    int[] vetA = new int[x];
    int[] vetB = new int[x];
    int[] vetC = new int[x];

    System.out.println("Digite os valores do vetor A:");

    for (i = 0 ; i < x ; i++) {
      System.out.println("Elemento [" + i + "]:");
      vetA[i] = sc.nextInt();
    }

    System.out.println();

    System.out.println("Digite os valore do vetor B:");

    for (i = 0 ; i < x ;i ++){
      System.out.println("Elemento [" + i + "]:");
      vetB[i] = sc.nextInt();
    }


    System.out.println();

    System.out.println("Vetor resultante: ");


    for (i = 0; i < x; i++){
      vetC[i] = vetA[i] + vetB[i];
      System.out.println(vetC[i]);
    }

    
    
  }
}
