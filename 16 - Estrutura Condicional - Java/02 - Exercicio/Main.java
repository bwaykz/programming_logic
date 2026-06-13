import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int x, y, z;

    System.out.println("**************************");
    System.out.println("* Programa Menor de tres *");
    System.out.println("**************************");

    System.out.println();

    System.out.println("Primeiro valor: ");
    x = sc.nextInt();

    System.out.println("Segundo valor: ");
    y = sc.nextInt();

    System.out.println("Terceiro valor: ");
    z = sc.nextInt();

    if (x < y && x < z) {

      System.out.println("Menor  = " + x);
      
    }if (y < x && y < z) {
      
      System.out.println("Menor = " + y);

    } else {
      
      System.out.println("Menor = " + z);

    }


  }
}
