import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numero;

    System.out.println("********************");
    System.out.println("* Programa tabuada *");
    System.out.println("********************");
    System.out.println();

    System.out.println("Voce quer a tabuada de qual numero? ");
    numero = sc.nextInt();

    multiplicacao(numero);



  }

  public static void multiplicacao(int a) {
    int multi, i;

    for ( i = 1 ; i <= 10 ; i++ ) {
      multi = a * i;
      System.out.println(a + " x " + i + " = " + multi);
    }











    


    
  }
}
