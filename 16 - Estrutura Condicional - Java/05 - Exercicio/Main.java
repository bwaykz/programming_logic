import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int uni;
    double preco, din, troco;

    System.out.println("*****************************");
    System.out.println("* Programa troco verificado *");
    System.out.println("*****************************");

    System.out.println();

    System.out.println("preco unitario do produto: ");
    preco = sc.nextDouble();

    System.out.println("Quantidade comprada: ");
    uni = sc.nextInt();

    System.out.println("Dinheiro recebido: ");
    din = sc.nextDouble();

    troco = (double) (preco * uni) - din;

    if (troco < din) {
      System.out.println("Troco = " + String.format("%.2f", troco));

    } else { 
        System.out.println("Dinheiro insuficiente. faltam " + troco + " reais");

    }




  }
}
