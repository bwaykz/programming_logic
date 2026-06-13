import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int x, i, soma;
    double media;

    System.out.println("***********************");
    System.out.println("* Programa Soma vetor *");
    System.out.println("***********************");

    System.out.println();

    System.out.println("Quantos numeros voce vai digitar: ");
    x = sc.nextInt();

    int[] vet = new int[x];

    for (i = 0 ; i < x ; i++) {
      System.out.println("Digite um numero: ");
      vet[i] = sc.nextInt();
    }

    System.out.println();

    System.out.println("Valores = ");

    for (i = 0; i < x; i++) {
      System.out.println(vet[i]);
    }

    soma = 0;

    for (i = 0 ; i < x ; i++ ) {
      soma = soma + vet[i];
    }

    System.out.println("Soma = " + soma);

    media = (double) soma / x ;

    System.out.println("Media = " + media);

    sc.close();
  }
}
