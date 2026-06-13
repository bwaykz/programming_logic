import java.util.Scanner;

public class Main {
  public static void main (String[] args){

    Scanner sc = new Scanner(System.in);

    double preco, din, troco;
    int quan;

    System.out.println("******************");
    System.out.println("* Programa Troco *");
    System.out.println("******************");


    System.out.println();

    System.out.println("Preco unitario do produto: ");
    preco = sc.nextDouble();

    System.out.println("Quantidade comprada: ");
    quan = sc.nextInt();

    System.out.println("Dinheiro recebido: ");
    din = sc.nextDouble();

    troco = (double) (preco * quan) - din;

    System.out.println("Troco = " + troco);

  }
}


