import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double gli;

    System.out.println("********************");
    System.out.println("* Programa Glicose *");
    System.out.println("********************");

    System.out.println();

    System.out.println("Digite a medida da glicose: ");
    gli = sc.nextDouble();

    if ( gli < 100) {

      System.out.println("Classificaçao: normal");
      
    }else if (gli <= 140) {

      System.out.println("Classificaçao: elevado");
      
    } else {
      
      System.out.println("Classificaçao: Diabetes");

    }




  }
}
