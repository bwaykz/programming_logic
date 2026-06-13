import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, posicaoMaior;
        double maiorValor;
        
        System.out.println("**************************");
        System.out.println("* Programa Maior Posicao *");
        System.out.println("**************************");
        
        System.out.println();
        
        System.out.print("Quanto numeros voce vai digitar? ");
        n = sc.nextInt();
        
        double[] vetor = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }
        
        maiorValor = vetor[0];
        posicaoMaior = 0;
        
        for (int i = 1; i < n; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posicaoMaior = i;
            }
        }
        
        System.out.println();
        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);
        
        sc.close();
    }
}
