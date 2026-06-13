import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    String nome;
    double valor, pagar;
    int hora;

    System.out.println("**********************");
    System.out.println("* Programa Pagamento *");
    System.out.println("**********************");

    System.out.println();

    System.out.println("Digite o nome do funcionario: ");
    nome = sc.nextLine();

    System.out.println("Digite o valor por hora trabalhada: ");
    valor = sc.nextDouble();

    System.out.println("Digite o total de horas trabalhadas: ");
    hora = sc.nextInt();

    System.out.println();

    pagar = (double) valor * hora;

    System.out.println("O pagamento para " + nome + " deve ser R$: " + String.format("%.2f", pagar));




  }
}


