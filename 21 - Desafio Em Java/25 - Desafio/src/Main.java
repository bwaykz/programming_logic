import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i, quantidadeDeParticipantes;
    quantidadeDeParticipantes = 0;


    System.out.println("Qual a quantidade de pessoas: ");
    quantidadeDeParticipantes = sc.nextInt();
    sc.nextLine();

    String[] nome = new String[quantidadeDeParticipantes];
    double[] etapa1 = new double[quantidadeDeParticipantes];
    double[] etapa2 = new double[quantidadeDeParticipantes];
    double[] media = new double[quantidadeDeParticipantes];

    
    for ( i = 0 ; i < quantidadeDeParticipantes ; i++ ) {
      System.out.println("Digite os dados da " + (i+1) + "a pessoa: ");
      System.out.println("Nome: ");
      nome[i] = sc.nextLine();
      System.out.println("Nota da etapa 1: ");
      etapa1[i] = sc.nextDouble();
      System.out.println("Nota da etapa 2: ");
      etapa2[i] = sc.nextDouble();
      media[i] = etapa1[i] + etapa2[i];
  
      sc.nextLine();
    }
    
    System.out.println();
    System.out.println("Tabela: ");

    for ( i = 0 ; i < quantidadeDeParticipantes ; i++ ) {
      System.out.print(nome[i]
        + ", " 
        + etapa1[i] 
        + ", " 
        + etapa2[i] 
        + ", media = " 
        + String.format("%.2f", media[i]));

      System.out.println();
    }

    System.out.println();

    System.out.println("Pessoas Aprovadas: ");

    for ( i = 0 ; i < quantidadeDeParticipantes ; i++ ) {

      if (media[i] >= 70.0) {
        System.out.println(nome[i]);
      }

    }




    sc.close();
  }
}
