import java.util.Scanner;

public class Main {
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);

    int x, i, maior;

    String nome1 = "";

    System.out.println("***********************");
    System.out.println("* Programa Mais velho *");
    System.out.println("***********************");
    
    System.out.println();

    System.out.println("Quantas pessoas voce vai digitar: ");
    x = sc.nextInt();

    String[] nome = new String[x];
    
    int[] idade = new int[x];

    for( i = 0 ; i < x ; i++ ) {
      System.out.println("Dados da " + i + "a pessoa: ");
      System.out.println("Nome: ");
      sc.nextLine();
      nome[i] = sc.nextLine();
      System.out.println("Idade: ");
      idade[i] = sc.nextInt();
    }

    maior = 0;
     
    for( i = 0 ; i < x ; i++ ) {
      if (idade[i] > maior) {
        maior = idade[i];
        nome1 = nome[i];
      }
    }

    System.out.println("Pessoa mais velha: " + nome1);

    
    sc.close();
  }
}
