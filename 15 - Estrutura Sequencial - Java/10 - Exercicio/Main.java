import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int duracao, horas, minutos, segundos;

        System.out.println("********************");
        System.out.println("* Programa Duracao *");
        System.out.println("********************");

        System.out.println();

        System.out.print("Digite a duracao em segundos: ");
        duracao = sc.nextInt();

        System.out.println();

        horas = duracao / 3600;
        minutos = (duracao % 3600) / 60;
        segundos = duracao % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
