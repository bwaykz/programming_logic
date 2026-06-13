import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, m;
        double soma, maiorMediaAluno, maiorMediaDisciplina;
        int indiceMaiorAluno, indiceMaiorDisciplina;
        
        System.out.println("**************************");
        System.out.println("* Programa Matriz Notas  *");
        System.out.println("**************************");
        
        System.out.println();
        
        System.out.print("Quantos alunos? ");
        n = sc.nextInt();
        
        System.out.print("Quantas disciplinas? ");
        m = sc.nextInt();
        
        System.out.println();
        
        String[] nomesAlunos = new String[n];
        String[] nomesDisciplinas = new String[m];
        double[][] notas = new double[n][m];
        double[] mediasAlunos = new double[n];
        double[] mediasDisciplinas = new double[m];
        
        // Leitura dos nomes dos alunos
        for (int i = 0; i < n; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomesAlunos[i] = sc.next();
        }
        
        System.out.println();
        
        // Leitura dos nomes das disciplinas
        for (int j = 0; j < m; j++) {
            System.out.print("Nome da disciplina " + (j + 1) + ": ");
            nomesDisciplinas[j] = sc.next();
        }
        
        System.out.println();
        
        // Leitura das notas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nota de " + nomesAlunos[i] + " em " + nomesDisciplinas[j] + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }
        
        System.out.println();
        
        // a) Calcular média de cada aluno
        for (int i = 0; i < n; i++) {
            soma = 0;
            for (int j = 0; j < m; j++) {
                soma += notas[i][j];
            }
            mediasAlunos[i] = soma / m;
        }
        
        // b) Calcular média da turma em cada disciplina
        for (int j = 0; j < m; j++) {
            soma = 0;
            for (int i = 0; i < n; i++) {
                soma += notas[i][j];
            }
            mediasDisciplinas[j] = soma / n;
        }
        
        // c) Encontrar aluno com maior média
        maiorMediaAluno = mediasAlunos[0];
        indiceMaiorAluno = 0;
        
        for (int i = 1; i < n; i++) {
            if (mediasAlunos[i] > maiorMediaAluno) {
                maiorMediaAluno = mediasAlunos[i];
                indiceMaiorAluno = i;
            }
        }
        
        // d) Encontrar disciplina com maior média
        maiorMediaDisciplina = mediasDisciplinas[0];
        indiceMaiorDisciplina = 0;
        
        for (int j = 1; j < m; j++) {
            if (mediasDisciplinas[j] > maiorMediaDisciplina) {
                maiorMediaDisciplina = mediasDisciplinas[j];
                indiceMaiorDisciplina = j;
            }
        }
        
        System.out.println("RELATORIO FINAL:");
        System.out.println();
        
        System.out.println("Medias dos alunos:");
        for (int i = 0; i < n; i++) {
            System.out.println(nomesAlunos[i] + ": " + String.format("%.2f", mediasAlunos[i]));
        }
        
        System.out.println();
        
        System.out.println("Medias das disciplinas:");
        for (int j = 0; j < m; j++) {
            System.out.println(nomesDisciplinas[j] + ": " + String.format("%.2f", mediasDisciplinas[j]));
        }
        
        System.out.println();
        
        System.out.println("Aluno com maior media: " + nomesAlunos[indiceMaiorAluno] + 
                          " (" + String.format("%.2f", maiorMediaAluno) + ")");
        
        System.out.println("Disciplina com maior media: " + nomesDisciplinas[indiceMaiorDisciplina] + 
                          " (" + String.format("%.2f", maiorMediaDisciplina) + ")");
        
        System.out.println();
        
        // e) Imprimir tabela formatada
        System.out.println("TABELA DE NOTAS:");
        
        // Cabeçalho da tabela
        System.out.print("          ");
        for (int j = 0; j < m; j++) {
            System.out.print(String.format("%-10s", nomesDisciplinas[j]) + " ");
        }
        System.out.println("Media");
        
        // Linhas com notas dos alunos
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("%-8s", nomesAlunos[i]) + " ");
            for (int j = 0; j < m; j++) {
                System.out.print(String.format("%-10.1f", notas[i][j]) + " ");
            }
            System.out.println(String.format("%.2f", mediasAlunos[i]));
        }
        
        // Linha com médias das disciplinas
        System.out.print("Media     ");
        for (int j = 0; j < m; j++) {
            System.out.print(String.format("%-10.2f", mediasDisciplinas[j]) + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
