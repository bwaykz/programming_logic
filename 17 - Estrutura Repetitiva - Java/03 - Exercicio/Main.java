import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int senha, senha2;
    
    System.out.println("***********************");
    System.out.println("* Programa Senha fica *");
    System.out.println("***********************");

    senha = 2002;

    System.out.println();

    System.out.println("Digite a primeira senha: ");
    senha2 = sc.nextInt();

    while (senha2 != senha) {
      System.out.println("Senha Invalida! Tente novamente: ");
      senha2 = sc.nextInt();
    }

    System.out.println("Acesso permitido!");



  }
}
