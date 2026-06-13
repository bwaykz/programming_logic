import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char escala;
        double temperatura, convertida;
        
        System.out.println("********************************");
        System.out.println("*  Conversor de Temperatura    *");
        System.out.println("********************************");
        
        System.out.println();
        
        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        escala = sc.next().charAt(0);
        
        System.out.println();
        
        if (escala == 'F' || escala == 'f') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = sc.nextDouble();
            convertida = (5.0 / 9.0) * (temperatura - 32);
            System.out.println();
            System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", convertida));
        } else {
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = sc.nextDouble();
            convertida = (temperatura * 9.0 / 5.0) + 32;
            System.out.println();
            System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", convertida));
        }
        
        sc.close();
    }
}
