import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double r, area;
        double pi = 3.14159;

        System.out.println("********************");
        System.out.println("* Programa Circulo *");
        System.out.println("********************");

        System.out.println();

        System.out.print("Digite o valor do raio do circulo: ");
        r = sc.nextDouble();

        System.out.println();

        area = pi * Math.pow(r, 2);

        System.out.println("AREA = " + String.format("%.3f", area));
    }
}
