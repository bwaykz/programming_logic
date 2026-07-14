import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("****************************");
    System.out.println("* Programa classificar imc *");
    System.out.println("****************************");
    System.out.println();

    System.out.print("Digite o peso: ");
    double peso = entrada.nextDouble();

    System.out.print("Digite a altura: ");
    double altura = entrada.nextDouble();

    double imcValor = calcularIMC(peso, altura);
    String classificacao = classificarIMC(imcValor);

    System.out.println();
    System.out.println("Resultado do IMC: " + classificacao);

    entrada.close();
  }

  public static double calcularIMC(double peso, double altura) {
    double quadradoAltura = altura * altura;
    double resultado = peso / quadradoAltura;
    return resultado;
  }

  public static String classificarIMC(double imc) {
    String classificacao;
    if (imc < 20) {
      classificacao = "abaixo do peso";
    } else if (imc < 25) {
      classificacao = "peso normal";
    } else if (imc < 30) {
      classificacao = "sobre peso";
    } else {
      classificacao = "obeso";
    }
    return classificacao;
  }
}
