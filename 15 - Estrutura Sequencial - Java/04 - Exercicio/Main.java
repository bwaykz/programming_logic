import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);

    int x, y, soma;

    System.out.println("*****************");
    System.out.println("* Programa soma *");
    System.out.println("*****************");

    System.out.println();

    System.out.println("Digite o valor de x: ");
    x = sc.nextInt();

    System.out.println("Digite o valor de y:");
    y = sc.nextInt();

    soma = x + y;

    System.out.println("Soma = " + soma);




 }
}

