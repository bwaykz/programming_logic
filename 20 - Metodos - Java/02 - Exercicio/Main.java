import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double precoDolar, quatia, contacao;

    System.out.println("*******************");
    System.out.println("* Programa Cambio *");
    System.out.println("*******************");

    System.out.println();

    System.out.println("Digite a contaçao do dolar: ");
    precoDolar = sc.nextDouble();

    System.out.println("Digite a quantia em reais: ");
    quatia = sc.nextDouble();

    contacao = cambio(precoDolar, quatia);

    System.out.println("Voce pode comprar " + String.format("%.2f", contacao) + " dolares com esta quantia");


    sc.close();
  }

  public static double cambio(double dolar, double quantia) {
    
    double conversao;
    conversao = quantia / dolar;

    return conversao;
  }



}
