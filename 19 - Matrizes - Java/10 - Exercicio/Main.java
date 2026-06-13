import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, positivos, negativos, somaPositivos, somaNegativos;
        
        System.out.println("**********************************");
        System.out.println("* Programa Positivos Negativos   *");
        System.out.println("**********************************");
        
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
        
        positivos = 0;
        negativos = 0;
        somaPositivos = 0;
        somaNegativos = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > 0) {
                    positivos++;
                    somaPositivos += matriz[i][j];
                } else if (matriz[i][j] < 0) {
                    negativos++;
                    somaNegativos += matriz[i][j];
                }
            }
        }
        
        System.out.println();
        
        System.out.println("POSITIVOS: " + positivos);
        System.out.println("NEGATIVOS: " + negativos);
        System.out.println("SOMA POSITIVOS: " + somaPositivos);
        System.out.println("SOMA NEGATIVOS: " + somaNegativos);
        
        sc.close();
    }
}
