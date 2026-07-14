import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("************************");
        System.out.println("* Programa financiamento *");
        System.out.println("************************");
        System.out.println();
        
        System.out.print("Valor total do imovel: ");
        double total = entrada.nextDouble();
        
        System.out.print("Valor pago na entrada: ");
        double entradaValor = entrada.nextDouble();
        
        System.out.print("Sera financiado em quantos meses? ");
        int meses = entrada.nextInt();
        
        double prestacaoValor = prestacao(total, entradaValor, meses);
        
        System.out.println();
        System.out.println("Valor de cada prestacao: " + String.format("%.2f", prestacaoValor));
        
        entrada.close();
    }
    
    public static double prestacao(double total, double entrada, int meses) {
        double valorFinanciado = total - entrada;
        double valorPrestacao = valorFinanciado / meses;
        return valorPrestacao;
    }
}
