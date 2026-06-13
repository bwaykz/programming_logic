import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int x,y;
  
    System.out.println("**********************");
    System.out.println("* Programa Crescente *");
    System.out.println("**********************");

    System.out.println();

    System.out.println("Digite dois numeros:" );

    System.out.println();

    System.out.println("Digite o primeiro numero: ");
    x = sc.nextInt();
    
    System.out.println("Digite o segundo numero: ");
    y = sc.nextInt();

    System.out.println();

    if ( x < y) {
      System.out.println("Crescente!");
    } else {
      System.out.println("Decrescente!");
    }
    


    while (x != y) {
    
      System.out.println("Digite novamente o primeiro numero: ");
      x = sc.nextInt();
      System.out.println("Digite novamente o segundo numero: ");
      y = sc.nextInt();

      if (x < y) {
        System.out.println("Crescente!");
      } else {
        System.out.println("Decrescente!");
      }     
    }




  }
}
