import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    double glicose, trigliceridios, colesterol;


    System.out.println("******************");
    System.out.println("* Programa exame *");
    System.out.println("******************");
    System.out.println();

    System.out.println("Medida da glicose: ");
    glicose = sc.nextDouble();   
    System.out.print("Classificaçao: ");
    metodoGlicose(glicose);
    
    System.out.println();

    System.out.println("Medida da trigliceridios: ");
    trigliceridios = sc.nextDouble();
    System.out.print("Classificaçao: ");
    metodoTrigliceridios(trigliceridios);
    
    System.out.println();

    System.out.println("Medida do colesterol: ");
    colesterol = sc.nextDouble();
    System.out.print("Classificaçao: ");
    metodoColesterol(colesterol);

    System.out.println();
    
    sc.close();
  }

  public static void metodoGlicose(double glicose) {
    if (glicose <= 100) {
      System.out.print("Normal");
    } else if ( glicose < 140){
      System.out.print("Elevado");
    } if ( glicose > 140 ) {
      System.out.print("Diabetes");
    } 
  }

  public static void metodoTrigliceridios(double trigliceridios) {
    if (trigliceridios <= 200) {
      System.out.print("Desejavel");
    } else if ( trigliceridios > 200){
      System.out.print("Aumentado");
    }
  }

  public static void metodoColesterol(double colesterol) {
    
    if (colesterol <= 200) {
      System.out.print("Desejavel");
    } else if ( colesterol < 240){
      System.out.print("Limiar");
    } if ( colesterol > 240 ) {
      System.out.print("Diabetes");
    }


  }



}
