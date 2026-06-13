import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int x, i;

    //int[] vet = new int [];
  
    System.out.println("**********************");
    System.out.println("* Problema negativos *");
    System.out.println("**********************");

    System.out.println();

    System.out.println("Quantos numeros voce vai digitar: ");
    x = sc.nextInt();

    int[] vet = new int[x];
    
    for (i = 0; i < x; i++) {
      System.out.println("Digite um numero: ");
      vet[i] = sc.nextInt();
    }


    System.out.println();


    for (i = 0 ; i < x; i++) {
      if (vet[i] < 0) {
        System.out.println(vet[i]);

      }
    }







    sc.close();
  }
}
