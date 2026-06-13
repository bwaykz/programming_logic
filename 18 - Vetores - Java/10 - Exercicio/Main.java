import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int x, i ;

    System.out.println("**********************");
    System.out.println("* Programa aprovados *");
    System.out.println("**********************");

    System.out.println();

    System.out.println("Quantos alunos serao digitados: ");
    x = sc.nextInt();

    String[] nome = new String[x];
    double[] nota1 = new double[x];
    double[] nota2 = new double[x];


    for ( i = 0 ; i < x ; i++ ){
      System.out.println("Digite o nome do " + i + "o aluno:");
      sc.nextLine();
      nome[i] = sc.nextLine();
      System.out.println("Digite a primeira nota do " + i + "o aluno: ");
      nota1[i] = sc.nextDouble();
      System.out.println("Digite a segunda nota do " + i + "o aluno: ");
      nota2[i] = sc.nextDouble();
    }

    System.out.println();

    System.out.println("Alunos aprovados: ");

    for( i = 0 ; i < x ; i++ ){
      if ((nota1[i] + nota2[i]) / 2  >= 6.0) {
          System.out.println(nome[i]);
        
      }


    }
    

  }
}
