import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int codigo, alcool, gasolina, diesel;
        
        System.out.println("****************************");
        System.out.println("* Programa de Combustiveis *");
        System.out.println("****************************");
        
        System.out.println();
        
        alcool = 0;
        gasolina = 0;
        diesel = 0;
        
        while (true) {
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            codigo = sc.nextInt();
            
            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            } else if (codigo == 4) {
                break;
            }
        }
        
        System.out.println();
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        sc.close();
    }
}
