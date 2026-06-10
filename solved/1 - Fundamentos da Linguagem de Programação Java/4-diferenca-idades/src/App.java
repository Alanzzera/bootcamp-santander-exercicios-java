import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o 1° nome");
        String name1 = scanner.next();
        System.out.println("Informe a idade do 1°");
        int age1 = scanner.nextInt();
        
        System.out.println("Informe o 2° nome");
        String name2 = scanner.next();
        System.out.println("Informe a idade do 2°");
        int age2 = scanner.nextInt();

        int difAge = age1 - age2;

        System.out.println("A diferença de idade de " + name1 + " x " + name2 + " é de " + difAge);

        scanner.close();
    }
}
