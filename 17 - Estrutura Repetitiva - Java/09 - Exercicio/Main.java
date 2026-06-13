import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int x, y, i, dentro, fora;

    System.out.println("************************");
    System.out.println("* Programa Dentro Fora *");
    System.out.println("************************");
    
    System.out.println();

    System.out.println("Quantos numeros voce vai digitar: ");
    x = sc.nextInt();

    fora = 0;
    dentro = 0;

    for(i = 0 ; i < x ; i++) {
      System.out.println("Digite um numero:");
      y = sc.nextInt();

      if (y < 10 || y > 20) {
        fora++;
        
      }else {
        dentro++;

      }

    }

    System.out.println(dentro + " Dentro");
    System.out.println(fora + " Fora");

    
    sc.close();
  }
}
