import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double gastoTotal, rendaAnualSalario, rendaAnualServico, rendaAnualCapital, gastosMedicos, gastosEducacionais, impostoSobreSalario, impostoSobreCapital, impostoSobreSercico, impostoBruto, impostoAbatido, impostoDevido;
    
    impostoSobreCapital = 0;
    impostoSobreSalario = 0;
    impostoSobreSercico = 0;


    System.out.println("Renda anual com salario: ");
    rendaAnualSalario = sc.nextDouble();
    
    System.out.println("Renda anual com prestaçao de serviço: ");
    rendaAnualServico = sc.nextDouble();

    System.out.println("Renda anual com ganho de capital: ");
    rendaAnualCapital = sc.nextDouble();

    System.out.println("Gastos medicos: ");
    gastosMedicos = sc.nextDouble();

    System.out.println("Gastos educacionais: ");
    gastosEducacionais = sc.nextDouble();
  
    impostoBruto = 0;

    if (rendaAnualSalario >= 36000 && rendaAnualSalario < 60000) {
      impostoSobreSalario = (rendaAnualSalario * 10) /100;
      rendaAnualSalario -= impostoSobreSalario;
      impostoBruto += impostoSobreSalario;
    } else if (rendaAnualSalario >= 60000) {
      impostoSobreSalario = (rendaAnualSalario * 20) /100;
      rendaAnualSalario -= impostoSobreSalario;
      impostoBruto += impostoSobreSalario;
    }

    if (rendaAnualServico > 1) {
      impostoSobreSercico = (rendaAnualServico * 15) /100;
      rendaAnualServico -= impostoSobreSercico;
      impostoBruto += impostoSobreSercico;
    }

    if (rendaAnualCapital > 1) {
      impostoSobreCapital = (rendaAnualCapital * 20) /100;
      rendaAnualCapital -= impostoSobreCapital;
      impostoBruto += impostoSobreCapital;
    }
    
    impostoAbatido = (impostoBruto * 30) / 100;

    gastoTotal = gastosMedicos + gastosEducacionais;

    impostoDevido = impostoBruto - impostoAbatido;

    System.out.println();

    System.out.println("RELATORIO DE IMPOSTO DE RENDA");

    System.out.println();

    System.out.println("CONSOLIDADO DE RENDA:");
    System.out.println("Imporsto sobre salario: " + String.format("%.2f", impostoSobreSalario));
    System.out.println("Imposto sobre serviços: " + String.format("%.2f", impostoSobreSercico));
    System.out.println("Imposto sobre ganho capital: " + String.format("%.2f", impostoSobreCapital));

    System.out.println();

    System.out.println("DEDUÇOES: ");
    System.out.println("Maximo dedutivel: " + String.format("%.2f", impostoAbatido));
    System.out.println("Gastos dedutiveis: " + String.format("%.2f", gastoTotal));

    System.out.println();

    System.out.println("RESUMO: ");
    System.out.println("Imposto brito total: " + String.format("%.2f", impostoBruto));
    System.out.println("Abatimento: " + String.format("%.2f",impostoAbatido));
    System.out.println("Imposto devido: " + String.format("%.2f", impostoDevido));



    sc.close();
  }
}
