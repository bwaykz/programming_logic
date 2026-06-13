import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, areaQuadrado, areaTriangulo, areaTrapezio;

        System.out.println("********************");
        System.out.println("* Programa Medidas *");
        System.out.println("********************");

        System.out.println();

        System.out.print("Digite a medida A: ");
        a = sc.nextDouble();

        System.out.print("Digite a medida B: ");
        b = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        c = sc.nextDouble();

        System.out.println();

        areaQuadrado = Math.pow(a, 2);
        areaTriangulo = (a * b) / 2;
        areaTrapezio = ((a + b) * c) / 2;

        System.out.println("AREA DO QUADRADO = " + String.format("%.4f", areaQuadrado));
        System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", areaTriangulo));
        System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", areaTrapezio));
    }
}
