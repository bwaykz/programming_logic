import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        
    double base, altura, area, perimetro, diagonal;
        
    System.out.println("**********************");
    System.out.println("* Programa Retangulo *");
    System.out.println("**********************");
        
    System.out.println();
        
    System.out.print("Base do retangulo: ");
    base = sc.nextDouble();
        
    System.out.print("Altura do retangulo: ");
    altura = sc.nextDouble();
        
    System.out.println();
        
    area = base * altura;
    perimetro = 2 * (base + altura);
    diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        
    System.out.println("AREA = " + String.format("%.4f", area));
    System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
    System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
        
    sc.close();
  }
}
