import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 3. Escreva um código que o usuário entre com um primeiro número, um segundo
        // número maior que o primeiro e escolhe entre a opção par e impar, com isso o
        // código deve informar todos os números pares ou ímpares (de acordo com a
        // seleção inicial) no intervalo de números informados, incluindo os números
        // informados e em ordem decrescente;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o número 1");
        int number1 = scanner.nextInt();

        System.out.println("Informe o número 2");
        int number2 = scanner.nextInt();

        do {
            System.out.println("Informe o numero2, deve ser maior que o numero1: " + number1);
            number2 = scanner.nextInt();
        } while (number2 <= number1);

        String option;

        do {
            System.out.println("Digite P para par ou I para ímpar:");
            option = scanner.next().toUpperCase();
        } while (!option.equals("P") && !option.equals("I"));
 
        for (int i = number2; i >= number1; i--) {
            if (option.equals("P") && i % 2 == 0) {
                System.out.println(i);
            }

            if (option.equals("I") && i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
