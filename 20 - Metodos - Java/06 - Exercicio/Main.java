import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("************************");
    System.out.println("* Programa exame       *");
    System.out.println("************************");
    System.out.println();

    System.out.print("Digite o peso: ");
    double peso = entrada.nextDouble();

    System.out.print("Digite a altura: ");
    double altura = entrada.nextDouble();

    double resultado = imc(peso, altura);

    System.out.println();
    System.out.println("IMC = " + String.format("%.2f", resultado));

    entrada.close();
  }

  public static double imc(double peso, double altura) {
    double calculo = peso / (altura * altura);
    return calculo;
  }
}
