import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    int x, i, multi;

    System.out.println("********************");
    System.out.println("* Programa tabuada *");
    System.out.println("********************");

    System.out.println();

    System.out.println("Deseja a tabuada para qual valor: ");
    x = sc.nextInt();
    
    multi = 0;
    for (i = 1; i <= 10; i++) {
      multi = x * i;
      System.out.println(x + " x " + i + " = " + multi);
    }

  }
}
