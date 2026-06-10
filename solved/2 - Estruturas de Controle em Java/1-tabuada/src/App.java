import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 1. Escreva um código onde o usuário entra com um número e seja gerada a
        // tabuada de 1 até 10 desse número;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}