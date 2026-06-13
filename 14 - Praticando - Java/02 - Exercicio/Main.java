import java.util.Locale;

public class Main {
  public static void main(String[] args) {

    int idade;
    double salario, altura;
    char genero;
    String nome;

    System.out.println("********************");
    System.out.println("* Programa Salario *");
    System.out.println("********************");

    System.out.println(" ");

    idade = 20;
    salario = 5800;
    altura = 1.63;
    genero = 'F';
    nome = "Maria Silva";

    System.out.println("Idade = " + idade);
    System.out.println("Salario = " + String.format("%.2f", salario));
    System.out.println("Altura = " + String.format("%.2f", altura));
    System.out.println("Genero = " + genero);
    System.out.println("Nome = " + nome);


  }
}
