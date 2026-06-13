import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, somaPrincipal, somaSecundaria;
        
        System.out.println("**************************");
        System.out.println("* Programa Soma Diagonal *");
        System.out.println("**************************");
        
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
        
        somaPrincipal = 0;
        somaSecundaria = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    somaPrincipal += matriz[i][j];
                }
                if (i + j == n - 1) {
                    somaSecundaria += matriz[i][j];
                }
            }
        }
        
        System.out.println();
        
        System.out.println("SOMA DIAGONAL PRINCIPAL: " + somaPrincipal);
        System.out.println("SOMA DIAGONAL SECUNDARIA: " + somaSecundaria);
        
        sc.close();
    }
}
