import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double altura1, altura2, resultado;


    System.out.println("Digite duas alturas: ");
    altura1 = sc.nextDouble();
    altura2 = sc.nextDouble();

    resultado = media(altura1,altura2);
    
    System.out.println("Resultado: " + resultado);

    System.out.println();
    
    int numero1, numero2, resultado1;


    System.out.println("Digite dois numeros para uma multiplicacao: ");
    numero1 = sc.nextInt();
    numero2 = sc.nextInt();

    resultado1 = 10 * multiplicacao(numero1,numero2);

    System.out.println("A multiplicacao e: " + resultado1);

    
    sc.close();
  }



  public static double media(double a, double b) {
    double resultado;
    resultado = (a + b) / 2;


    return resultado;
  }

  public static int multiplicacao(int a, int b) {
    int multi;
    multi = a * b;

    return multi;
  }
}
