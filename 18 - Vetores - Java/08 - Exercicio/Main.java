import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, quantidadePares;
        double somaPares, media;
        
        System.out.println("**************************");
        System.out.println("* Programa Media Pares   *");
        System.out.println("**************************");
        
        System.out.println();
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        
        int[] vetor = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        
        somaPares = 0;
        quantidadePares = 0;
        
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                quantidadePares++;
            }
        }
        
        System.out.println();
        
        if (quantidadePares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            media = somaPares / quantidadePares;
            System.out.println("MEDIA DOS PARES = " + String.format("%.1f", media));
        }
        
        sc.close();
    }
}
