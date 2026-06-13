import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    
    int x, quan;
    double valor;
    
    System.out.println("***********************");
    System.out.println("* Programa Lanchonete *");
    System.out.println("***********************");

    System.out.println();

    System.out.println("Codigo do produto comprado: ");
    x = sc.nextInt();

    System.out.println("Quantidade comprada: ");
    quan = sc.nextInt();



    switch (x) {
      case 1:
        valor = (double) 5.00 * quan;
        System.out.println("Valor a pagar: R$: " + String.format("%.2f", valor));
        break;
      case 2:
        valor = (double) 3.50 * quan;
        System.out.println("Valor a pagar: R$: " + String.format("%.2f", valor));
        break;
      case 3:
        valor = (double) 4.80 * quan;
        System.out.println("Valor a pagar: R$: " + String.format("%.2f", valor));
        break;
      case 4:
        valor = (double) 8.90 * quan;
        System.out.println("Valor a pagar: R$: " + String.format("%.2f", valor));
        break;
      case 5:
        valor = (double) 7.32 * quan;
        System.out.println("Valor a pagar: R$: " + String.format("%.2f", valor));



    }






  }
}
