import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, soma;
        
        System.out.println("******************************");
        System.out.println("* Programa Acima Diagonal    *");
        System.out.println("******************************");
        
        System.out.println();
        
        System.out.print("Qual a ordem da matriz? ");
        n = sc.nextInt();
        
        int[][] matriz = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        soma = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                soma += matriz[i][j];
            }
        }
        
        System.out.println();
        
        System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
        
        sc.close();
    }
}
