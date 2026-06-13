import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    
    int dis;
    double comb, media;

    System.out.println("********************");
    System.out.println("* Programa consumo *");
    System.out.println("********************");

    System.out.println();

    System.out.println("Distancia percorrida: ");
    dis = sc.nextInt();

    System.out.println("Combustivel gasto: ");
    comb = sc.nextDouble();

    System.out.println();

    media = (double) dis / comb;

    System.out.println("Consumo medio = " + String.format("%.3f", media));
    
    

  }
}
