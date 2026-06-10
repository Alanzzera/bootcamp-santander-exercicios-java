import java.time.Year;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // 1. Escreva um código que receba o nome e o ano de nascimento de alguém e 
        // imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String name = scanner.next();

        System.out.println("Informe seu ano de nascimento:");
        int yearBirth = scanner.nextInt();

        int age = Year.now().getValue() - yearBirth;

        System.out.println("Olá " + name + ", você tem " + age + " anos.");

        scanner.close();
    }
}