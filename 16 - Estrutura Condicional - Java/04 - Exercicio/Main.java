import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int minutos;
        double valorPagar;
        
        System.out.println("**************************");
        System.out.println("*  Operadora Telefonica  *");
        System.out.println("**************************");
        
        System.out.println();
        
        System.out.print("Digite a quantidade de minutos: ");
        minutos = sc.nextInt();
        
        if (minutos <= 100) {
            valorPagar = 50.00;
        } else {
            valorPagar = 50.00 + (minutos - 100) * 2.00;
        }
        
        System.out.println();
        
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorPagar));
        
        sc.close();
    }
}
