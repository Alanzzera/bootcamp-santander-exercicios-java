import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o
        // calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de
        // acordo com o resultado:
        // - Se for menor ou igual a 18,5 "Abaixo do peso";
        // - se for entre 18,6 e 24,9 "Peso ideal";
        // - Se for entre 25,0 e 29,9 "Levemente acima do peso";
        // - Se for entre 30,0 e 34,9 "Obesidade Grau I";
        // - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        // - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua altura em metros:");
        float height = scanner.nextFloat();

        System.out.println("Informe seu peso:");
        float weight = scanner.nextFloat();

        float imc = weight / (height * height);

        String message;

        if (imc <= 18.5) {
            message = "Abaixo do peso";
        } else if (imc <= 24.9) {
            message = "Peso ideal";
        } else if (imc <= 29.9) {
            message = "Levemente acima do peso";
        } else if (imc <= 34.9) {
            message = "Obesidade Grau I";
        } else if (imc <= 39.9) {
            message = "Obesidade Grau II (Severa)";
        } else {
            message = "Obesidade Grau III (Mórbida)";
        }

        System.out.println("IMC: " + imc);
        System.out.println(message);

        scanner.close();
    }
}