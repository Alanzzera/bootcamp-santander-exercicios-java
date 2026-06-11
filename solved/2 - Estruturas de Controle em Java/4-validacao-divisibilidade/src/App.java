import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 4. Escreva um código onde o usuário informa um número inicial, posteriormente
        // irá informar outros N números, a execução do código irá continuar até que o
        // número informado dividido pelo primeiro número tenha resto diferente de 0 na
        // divisão, números menores que o primeiro número devem ser ignorados
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inicial:");
        int number1 = scanner.nextInt();

        int number2;
        while (true) {
            System.out.println("Informe um número:");
            number2 = scanner.nextInt();

            if (number2 < number1) {
                System.out.println("Número ignorado.");
                continue;
            }

            if (number2 % number1 != 0) {
                System.out.println("Número informado não é divisível por " + number1);
                break;
            }
        }
        System.out.println("Número informado não é divisível por " + number1);

        scanner.close();
    }
}