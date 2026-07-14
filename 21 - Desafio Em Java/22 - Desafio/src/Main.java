import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int sexo;
    int quantidadeDeCerveja, quantidadeDeRefrigerante, quantidadeDeEspetinho;
    double ingresso, cerveja, refrigerante, courvert, espetinho, consumo, valorTotal;

    ingresso = 10.00;
    cerveja = 5.00;
    refrigerante = 3.00;
    espetinho = 7.00;
    courvert = 4.00;

    System.out.println("Qual o sexo do cliente [1=F/2=M]: ");
    sexo = sc.nextInt();

    if (sexo == 1) {
      ingresso -= 2;
    }

    System.out.println("Quantidade de cervejas: ");
    quantidadeDeCerveja = sc.nextInt();

    System.out.println("Quantidade de refrigerantes: ");
    quantidadeDeRefrigerante = sc.nextInt();

    System.out.println("Quantidade de espetinhos: ");
    quantidadeDeEspetinho = sc.nextInt();

    consumo = (quantidadeDeCerveja * cerveja)
        + (quantidadeDeEspetinho * espetinho)
        + (quantidadeDeRefrigerante * refrigerante);

    System.out.println();

    System.out.println("Relatorio: ");

    System.out.println("Consumo = " + consumo);

    if (consumo < 30) {
      consumo += courvert;
      System.out.println("courvert = " + courvert);

    } else {
      System.out.println("isento de courvert.");
    }

    System.out.println("ingresso = " + ingresso);

    System.out.println();

    valorTotal = consumo + ingresso;

    System.out.println("Valor a pagar = " + valorTotal);

  }
}
