import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("************************");
    System.out.println("* Programa retangulo   *");
    System.out.println("************************");
    System.out.println();

    System.out.print("Digite o valor da base do retangulo: ");
    double base = entrada.nextDouble();

    System.out.print("Digite o valor da altura do retangulo: ");
    double altura = entrada.nextDouble();

    double diagonalValor = diagonal(base, altura);
    double areaValor = area(base, altura);
    double perimetroValor = perimetro(base, altura);

    System.out.println();
    System.out.println("Diagonal = " + String.format("%.2f", diagonalValor));
    System.out.println("Area = " + String.format("%.2f", areaValor));
    System.out.println("Perimetro = " + String.format("%.2f", perimetroValor));

    entrada.close();
  }

  public static double diagonal(double base, double altura) {
    double somaQuadrados = (base * base) + (altura * altura);
    double resultado = Math.sqrt(somaQuadrados);
    return resultado;
  }

  public static double area(double base, double altura) {
    double resultado = base * altura;
    return resultado;
  }

  public static double perimetro(double base, double altura) {
    double soma = base + altura;
    double resultado = 2 * soma;
    return resultado;
  }
}
