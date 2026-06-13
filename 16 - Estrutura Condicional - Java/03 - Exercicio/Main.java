import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, delta, x1, x2;
        
        System.out.println("**************************");
        System.out.println("*  Formula de Bhaskara  *");
        System.out.println("**************************");
        
        System.out.println();
        
        System.out.print("Coeficiente a: ");
        a = sc.nextDouble();
        
        System.out.print("Coeficiente b: ");
        b = sc.nextDouble();
        
        System.out.print("Coeficiente c: ");
        c = sc.nextDouble();
        
        System.out.println();
        
        delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta < 0) {
            System.out.println("Esta equacao nao possui raizes reais");
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.println("X1 = " + String.format("%.4f", x1));
            System.out.println("X2 = " + String.format("%.4f", x2));
        }
        
        sc.close();
    }
}
