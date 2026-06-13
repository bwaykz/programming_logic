import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    int x, i;

    double media, soma;

    System.out.println("****************************");
    System.out.println("* Programa abaixo da media *");
    System.out.println("****************************");

    System.out.println();

    System.out.println("Quantos Elementos vai ter o vetor: ");
    x = sc.nextInt();

    double[] vet = new double[x];

    for ( i = 0 ; i < x ; i++ ){
      System.out.println("Digite um numero: ");
      vet[i] = sc.nextDouble();
    }

    soma = 0;

    for ( i = 0 ; i < x ;  i++ ) {
      soma = soma + vet[i];
    }

    media = (double) soma / x;

    System.out.println();

    System.out.println("Media do vetor = " +  media);

    System.out.println();

    System.out.println("Elementos abaixo da media: ");

    for ( i = 0 ; i < x ; i++ ) {
      if (vet[i] < media) {
        System.out.println(vet[i]);

      }

    }


  }
}
