import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, quantidade, total, totalCoelhos, totalRatos, totalSapos;
        char tipo;
        double percentualCoelhos, percentualRatos, percentualSapos;
        
        System.out.println("**************************");
        System.out.println("* Programa Experiencias  *");
        System.out.println("**************************");
        
        System.out.println();
        
        System.out.print("Quantos casos de teste serao digitados? ");
        n = sc.nextInt();
        
        total = 0;
        totalCoelhos = 0;
        totalRatos = 0;
        totalSapos = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Quantidade de cobaias: ");
            quantidade = sc.nextInt();
            
            System.out.print("Tipo de cobaia: ");
            tipo = sc.next().charAt(0);
            
            total += quantidade;
            
            if (tipo == 'C') {
                totalCoelhos += quantidade;
            } else if (tipo == 'R') {
                totalRatos += quantidade;
            } else if (tipo == 'S') {
                totalSapos += quantidade;
            }
        }
        
        percentualCoelhos = (totalCoelhos * 100.0) / total;
        percentualRatos = (totalRatos * 100.0) / total;
        percentualSapos = (totalSapos * 100.0) / total;
        
        System.out.println();
        System.out.println("RELATORIO FINAL:");
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", percentualCoelhos));
        System.out.println("Percentual de ratos: " + String.format("%.2f", percentualRatos));
        System.out.println("Percentual de sapos: " + String.format("%.2f", percentualSapos));
        
        sc.close();
    }
}
