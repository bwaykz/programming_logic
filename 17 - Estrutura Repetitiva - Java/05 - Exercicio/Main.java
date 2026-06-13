import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    double nt1, nt2, media;

    System.out.println("******************************");
    System.out.println("* Programa Validaçao de nota *");
    System.out.println("******************************");

    System.out.println();

    System.out.println("Digite a primeira nota: ");
    nt1 = sc.nextDouble();

    while (nt1 < 0) {
      System.out.println("Valor Invalido! Tente novamente: ");
      nt1 = sc.nextDouble();
    }

    System.out.println("Digite a segunda nota: ");
    nt2 = sc.nextDouble();

    while (nt2 < 0) {
      System.out.println("Valor Invalido! Tente novamente: ");
      nt2 = sc.nextDouble();
    }
    
    media = (nt1 + nt2) / 2;

    System.out.println("Media = " + String.format("%.2f", media));


  }
}
