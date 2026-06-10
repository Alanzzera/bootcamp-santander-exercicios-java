import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 3. Escreva um código que receba a base e a alturade um retângulo, calcule sua
        // área e exiba na tela - fórmula: área=base X altura
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base do retângulo:");
        int base = scanner.nextInt();
        System.out.println("Informe a altura do retângulo:");
        int height = scanner.nextInt();

        int area = base * height;

        System.out.println("A área do retângulo é " + area);

        scanner.close();
    }
}
