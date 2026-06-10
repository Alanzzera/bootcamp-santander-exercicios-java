import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 2. Escreva um código que receba o tamanho do lado de um quadrado, calcule sua
        // área e exiba na tela - fórmula: área=lado X lado

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado de um quadrado:");
        int size = scanner.nextInt();

        int area = size * size;

        System.out.println("A área do quadrado é " + area);

        scanner.close();
    }
}
