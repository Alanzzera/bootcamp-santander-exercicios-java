import java.util.Scanner;

public class App {
    // 3. Escreva um código onde temos o controle de banho de um petshop, a maquina
    // de banhos dos pets deve ter as seguintes operações:
    // - Dar banho no pet;
    // - Abastecer com água;
    // - Abastecer com shampoo;
    // - verificar nivel de água;
    // - verificar nivel de shampoo;
    // - verificar se tem pet no banho;
    // - colocar pet na maquina;
    // - retirar pet da máquina;
    // - limpar maquina.

    // Siga as seguintes regras para implementação

    // - A maquina de banho deve permitir somente 1 pet por vez;
    // - Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
    // - A máquina tem capacidade máxima de 30 litros de água e 10 litros de
    // shampoo;
    // - Se o pet for retirado da maquina sem estar limpo será necessário limpar a
    // máquina para permitir a entrada de outro pet;
    // - A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
    // - O abastecimento de água e shampoo deve permitir 2 litros por vez que for
    // acionado;

    private Scanner scanner = new Scanner(System.in);
    private PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        new App().start();
    }

    public void start() {

        int option;

        do {
            System.out.println("\n=== PET SHOP ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água");
            System.out.println("3 - Abastecer com shampoo");
            System.out.println("4 - Verificar nível de água");
            System.out.println("5 - Verificar nível de shampoo");
            System.out.println("6 - Verificar se tem pet");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.washPet();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addShampoo();
                case 4 -> petMachine.showWaterLevel();
                case 5 -> petMachine.showShampooLevel();
                case 6 -> petMachine.showPetStatus();
                case 7 -> addPet();
                case 8 -> petMachine.removerPet();
                case 9 -> petMachine.cleanMachine();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida");
            }

        } while (option != 0);

        scanner.close();
    }

    private void addPet() {

        String name;

        do {
            System.out.println("Informe o nome do pet:");
            name = scanner.next().trim();
        } while (name.isEmpty());

        Pet pet = new Pet(name);

        petMachine.setPet(pet);
    }
}