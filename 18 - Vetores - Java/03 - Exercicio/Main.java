import java.util.Scanner;


public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int x, i;

    double media, soma;

    //String[] nome = new String [];

    System.out.println("********************");
    System.out.println("* Programa Alturas *");
    System.out.println("********************");

    System.out.println();

    System.out.println("Quantas pessoas serao digitada: ");
    x = sc.nextInt();

    String[] nome = new String[x];
    int[] idade = new int[x];
    double[] altura = new double[x];

    for (i = 0 ; i < x; i++) {
      System.out.println("Dados da " + i + "a pessoa: " );
      System.out.println("Nome:");
      sc.nextLine();
      nome[i] = sc.nextLine();
      System.out.println("Idade: ");
      idade[i] = sc.nextInt();
      System.out.println("Altura: ");
      altura[i] = sc.nextDouble();
    }

    media = 0;
    soma = 0;
    
    for (i = 0; i < x; i++) {
      soma = soma + altura[i];

    }

    media = (double) soma / x ;
    
    System.out.println("Altura media = " + String.format("%.2f", media));


    System.out.println("Pessoas com menos de 16 anos:" );

    for (i = 0; i < x; i++) {
      if (idade[i] < 16) {
        System.out.println(nome[i]);
        
      }

    }

    sc.close();
  }
}
