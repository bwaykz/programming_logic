import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int quantidadeAtletas, i;

    System.out.println("*******************");
    System.out.println("* Desafio atletas *");
    System.out.println("*******************");

    System.out.println();

    System.out.println("Qual a quantidade de atletas: ");
    quantidadeAtletas = sc.nextInt();

    char[] sexo = new char[quantidadeAtletas];
    double[] peso = new double[quantidadeAtletas];
    double[] altura = new double[quantidadeAtletas];
    String[] nome = new String[quantidadeAtletas];

    for (i = 0; i < quantidadeAtletas; i++) {
      System.out.println("Digite os dados do atleta numero " + ( i + 1 ));
      System.out.println("Nome: ");
      nome[i] = sc.nextLine();
     

      System.out.println("Sexo: ");
      sexo[i] = sc.next().charAt(0);
      while (sexo[i] != 'F' && sexo[i] != 'M') {
        System.out.println("Valor invalido! Favor digitar F ou M:");
        sexo[i] = sc.next().charAt(0);
      }

      System.out.println("Altura: ");
      altura[i] = sc.nextDouble();
      while (altura[i] <= 0) {
        System.out.println("Valor invalido! Favor digitar novamente: ");
        altura[i] = sc.nextDouble();
      }

      System.out.println("Peso: ");
      peso[i] = sc.nextDouble();
      while (peso[i] <= 0) {
        System.out.println("Valor invalido! Favor digitar novamente: ");
        peso[i] = sc.nextDouble();
      }
      sc.nextLine();
    }

    System.out.println();

    double alturaMedia;
    String atletaMaisAlto;
    atletaMaisAlto = "";

    alturaMedia = 0;

    for (i = 0; i < quantidadeAtletas; i++) {
      alturaMedia += altura[i];
    }

    alturaMedia = alturaMedia / quantidadeAtletas;
    double maisAlto;
    int posicao;
    posicao = 0;
    
    maisAlto = 0;

    for (i = 0; i < quantidadeAtletas; i++) {
      if (altura[i] > maisAlto) {
        maisAlto = altura[i];
        posicao = i;
      }
    }
    atletaMaisAlto = nome[posicao];
    double pesoMedio;
    pesoMedio = 0.0;

    for (i = 0; i < quantidadeAtletas; i++) {
      pesoMedio += peso[i];
    }

    pesoMedio = pesoMedio / quantidadeAtletas;

    System.out.println("Relatorio: ");
    System.out.println("Altura media dos atletas: " + String.format("%.2f", alturaMedia));
    System.out.println("Atleta mais alto: " + atletaMaisAlto);
    System.out.println("Peso medio dos atletas: " + pesoMedio);

    sc.close();
  }
}
