import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double lar, comp, valor, area, preco;

    System.out.println("********************");
    System.out.println("* Programa Terreno *");
    System.out.println("********************");

    System.out.println();

    System.out.println("Digite a largura do terreno: ");
    lar = sc.nextDouble();

    System.out.println("Digite o comprimento do terreno: ");
    comp = sc.nextDouble();

    System.out.println("Digite o valor do metro quadrado: ");
    valor = sc.nextDouble();

    System.out.println();

    area = lar * comp;
    preco = area * valor;

    System.out.println("Area do terreno = " + String.format("%.2f", area));
    System.out.println("Preco do terreno = " + String.format("%.2f", preco));
    

  }
}
