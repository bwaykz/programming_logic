import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    double dis1, dis2, dis3;

    System.out.println("******************");
    System.out.println("* Programa Dardo *");
    System.out.println("******************");

    System.out.println();

    System.out.println("Digite a primeira distancia: ");
    dis1 = sc.nextDouble();

    System.out.println("Digite a Segunda distancia: ");
    dis2 = sc.nextDouble();

    System.out.println("Digite a terceira distancia: ");
    dis3 = sc.nextDouble();

    System.out.println();

    if (dis1 > dis2 && dis1 > dis3) {

      System.out.println("Maior distancia = " + String.format("%.2f", dis1));
      
    } else if (dis2 > dis1 && dis2 > dis3) {

      System.out.println("Maior distancia = " + String.format("%.2f", dis2));
      
    } else {

      System.out.println("Maior distancia = " + String.format("%.2f", dis3));

    }



  }
}
