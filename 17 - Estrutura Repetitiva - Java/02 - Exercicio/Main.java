import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int id1, id2, id3;
    double media;

    System.out.println("*************************");
    System.out.println("* Programa Media idades *");
    System.out.println("*************************");

    System.out.println();

    System.out.println("Digite a primeira idade: ");
    id1 = sc.nextInt();

    while (id1 < 0) {
      System.out.println("Valor invalido! Digite novamente: ");
      id1 = sc.nextInt();
    }

    System.out.println("Digite a segunda idade: ");
    id2 = sc.nextInt();

    while (id2 < 0) {
      System.out.println("Valor invalido! Digite novamente: ");
      id2 = sc.nextInt();
    }

    System.out.println("Digite a terceira idade: ");
    id3 = sc.nextInt();

    while (id3 < 0) {
      System.out.println("Valor invalido! Digite novamente: ");
      id3 = sc.nextInt();
    }

    media = (double) (id1 + id2 + id3) / 3;

    System.out.println("Media = " + String.format("%.2f", media));



  }
}
