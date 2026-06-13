import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, linha, coluna;
        double somaPositivos;
        
        System.out.println("**************************");
        System.out.println("* Programa Matriz Geral  *");
        System.out.println("**************************");
        
        System.out.println();
        
        System.out.print("Qual a ordem da matriz? ");
        n = sc.nextInt();
        
        double[][] matriz = new double[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }
        
        System.out.println();
        
        // a) Soma dos elementos positivos
        somaPositivos = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > 0) {
                    somaPositivos += matriz[i][j];
                }
            }
        }
        
        System.out.println("SOMA DOS POSITIVOS: " + somaPositivos);
        
        System.out.println();
        
        // b) Ler índice de uma linha e imprimir seus elementos
        System.out.print("Escolha uma linha: ");
        linha = sc.nextInt();
        
        System.out.print("LINHA ESCOLHIDA: ");
        
        for (int j = 0; j < n; j++) {
            System.out.print(matriz[linha][j] + " ");
        }
        
        System.out.println();
        
        System.out.println();
        
        // c) Ler índice de uma coluna e imprimir seus elementos
        System.out.print("Escolha uma coluna: ");
        coluna = sc.nextInt();
        
        System.out.print("COLUNA ESCOLHIDA: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][coluna] + " ");
        }
        
        System.out.println();
        
        System.out.println();
        
        // d) Imprimir diagonal principal
        System.out.print("DIAGONAL PRINCIPAL: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        
        System.out.println();
        
        System.out.println();
        
        // e) Elevar ao quadrado os números negativos e imprimir matriz alterada
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
            }
        }
        
        System.out.println("MATRIZ ALTERADA:");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
