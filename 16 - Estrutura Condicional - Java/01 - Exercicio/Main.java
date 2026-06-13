import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double nt1, nt2, media;

    System.out.println("*******************************");
    System.out.println("* Programa Aprovado/reprovado *");
    System.out.println("*******************************");

    System.out.println();

    System.out.println("Digite a primeira nota: ");
    nt1 = sc.nextDouble();

    System.out.println("Digite a segunda nota: ");
    nt2 = sc.nextDouble();

    media = nt1 + nt2;

    if (media < 60.0) {

      System.out.println("Nota final = " + String.format("%.1f", media));
      System.out.println("Reprovado!");
      
    } else {

      System.out.println("Nota final = " + String.format("%.1f", media));
      System.out.println("Aprovado!");

    }








  }
}
