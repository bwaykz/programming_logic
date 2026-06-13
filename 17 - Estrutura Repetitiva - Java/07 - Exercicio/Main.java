import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x, soma, contador;
        
        System.out.println("*************************");
        System.out.println("* Programa Consecutivos *");
        System.out.println("*************************");
        
        System.out.println();
        
        while (true) {
            System.out.print("Digite um numero inteiro: ");
            x = sc.nextInt();
            
            if (x == 0) {
                break;
            }
            
            // Se X for ímpar, avança para o próximo par
            if (x % 2 != 0) {
                x++;
            }
            
            soma = 0;
            contador = 0;
            
            // Soma 5 pares consecutivos
            while (contador < 5) {
                soma += x;
                x += 2;
                contador++;
            }
            
            System.out.println("SOMA = " + soma);
        }
        
        sc.close();
    }
}
