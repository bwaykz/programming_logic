import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
    double glicose;

    System.out.println("********************");
    System.out.println("* Programa glicose *");
    System.out.println("********************");
    System.out.println();

    System.out.println("Digite o calor da glicose: ");
    glicose = sc.nextDouble();
    
    System.out.print("Classicacao: ");
    classicacao(glicose);

    sc.close();
  }

  public static void classicacao(double a){
    
    if (a <= 100 ) {
      System.out.print("Normal");
    } else if (a < 140) {
      System.out.print("Elevado");
    } if ( a > 140) {
      System.out.print("Diabetes");
    }


  }

}
