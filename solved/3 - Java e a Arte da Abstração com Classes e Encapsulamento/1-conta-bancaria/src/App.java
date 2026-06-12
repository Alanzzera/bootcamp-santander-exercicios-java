import java.util.Scanner;

public class App {
    // 1. Escreva um código onde temos uma conta bancaria que possa realizar as
    // seguintes operações:
    // - Consultar saldo
    // - consultar cheque especial
    // - Depositar dinheiro;
    // - Sacar dinheiro;
    // - Pagar um boleto.
    // - Verificar se a conta está usando cheque especial.

    // Siga as seguintes regras para implementar
    // - A conta bancária deve ter um limite de cheque especial somado ao saldo da
    // conta;
    // - O o valor do cheque especial é definido no momento da criação da conta, de
    // acordo com o valor depositado na conta em sua criação;
    // - Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque
    // especial deve ser de R$50,00
    // - Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor
    // depositado;
    // - Caso o limite de cheque especial seja usado, assim que possível a conta
    // deve cobrar uma taxa de 20% do valor usado do cheque especial.

    private Scanner scanner = new Scanner(System.in);
    private ContaBancaria contaBancaria;

    public static void main(String[] args) {
        new App().start();
    }

    public void start() {
        System.out.println("=== Abertura de Conta ===");
        System.out.print("Informe o depósito inicial: R$ ");
        double depositoInicial = scanner.nextDouble();

        contaBancaria = new ContaBancaria(depositoInicial);

        int option;

        do {
            System.out.println("\n=== Informe o que deseja ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> contaBancaria.consultarSaldo();
                case 2 -> contaBancaria.consultarChequeEspecial();
                case 3 -> {
                    System.out.print("Valor do depósito: R$ ");
                    double valor = scanner.nextDouble();
                    contaBancaria.depositar(valor);
                }
                case 4 -> {
                    System.out.print("Valor do saque: R$ ");
                    double valor = scanner.nextDouble();
                    contaBancaria.sacar(valor);
                }
                case 5 -> {
                    System.out.print("Valor do boleto: R$ ");
                    double valor = scanner.nextDouble();
                    contaBancaria.pagarBoleto(valor);
                }
                case 6 -> contaBancaria.estaUsandoChequeEspecial();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (option != 0);

        scanner.close();
    }
}