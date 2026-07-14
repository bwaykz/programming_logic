import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("************************");
    System.out.println("* Programa temperatura *");
    System.out.println("************************");
    System.out.println();

    System.out.print("Digite a temperatura em Fahrenheit: ");
    double fahrenheit = entrada.nextDouble();

    double celsius = fahrenheitParaCelsius(fahrenheit);

    System.out.println("Temperatura em Celsius = " + String.format("%.2f", celsius));

    entrada.close();
  }

  public static double fahrenheitParaCelsius(double f) {
    double calculo = (5.0 / 9.0) * (f - 32);
    return calculo;
  }
}
