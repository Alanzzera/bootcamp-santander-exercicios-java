public class ContaBancaria {

    private double saldo;
    private double limiteChequeEspecial;
    private double valorUsadoChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        this.valorUsadoChequeEspecial = 0.0;

        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50.0;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }

        System.out.println("Conta criada com saldo inicial de R$ " + saldo);
        System.out.println("Limite do cheque especial: R$ " + limiteChequeEspecial);
    }

    public double consultarSaldo() {
        System.out.println("Saldo: R$ " + saldo);
        return saldo;
    }

    public double consultarChequeEspecial() {
        double disponivel = limiteChequeEspecial - valorUsadoChequeEspecial;
        System.out.println("Cheque especial disponível: R$ " + disponivel);
        return disponivel;
    }

    public boolean estaUsandoChequeEspecial() {
        boolean usando = valorUsadoChequeEspecial > 0;

        if (usando) {
            System.out.println("A conta está utilizando cheque especial.");
        } else {
            System.out.println("A conta NÃO está utilizando cheque especial.");
        }

        return usando;
    }

    public void depositar(double valor) {

        if (estaUsandoChequeEspecial()) {
            double taxa = valorUsadoChequeEspecial * 0.20;
            double divida = valorUsadoChequeEspecial + taxa;
            System.out.println("Dívida do cheque especial: R$ " + divida);

            if (valor >= divida) {
                valor -= divida;
                valorUsadoChequeEspecial = 0;
                System.out.println("Cheque especial quitado.");
            } else {
                divida -= valor;
                valorUsadoChequeEspecial = divida * taxa;
                System.out.println("Depósito usado para abater a dívida.");
                System.out.println("Dívida restante: R$ " + divida);
                return;
            }
        }

        saldo += valor;

        System.out.println("Depósito de R$ " + valor + " realizado.");
        System.out.println("Novo saldo: R$ " + saldo);
    }

    public boolean sacar(double valor) {
        double limiteTotal = saldo + (limiteChequeEspecial - valorUsadoChequeEspecial);

        if (valor > limiteTotal) {
            System.out.println("Valor solicitado: R$ " + valor);
            System.out.println("Limite disponível: R$ " + limiteTotal);
            System.out.println("Saque não realizado.");
            return false;
        }

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
            System.out.println("Saldo restante: R$ " + saldo);
        } else {
            double restante = valor - saldo;

            saldo = 0;
            valorUsadoChequeEspecial += restante;

            System.out.println("Saque de R$ " + valor + " realizado.");
            System.out.println("Utilizado R$ " + restante + " do cheque especial.");
            System.out.println("Cheque especial utilizado no total: R$ " + valorUsadoChequeEspecial);
        }

        return true;
    }

    public boolean pagarBoleto(double valor) {
        System.out.println("Pagamento de boleto no valor de R$ " + valor);

        if (sacar(valor)) {
            System.out.println("Boleto pago com sucesso.");
            return true;
        }

        System.out.println("Falha ao pagar boleto.");
        return false;
    }
}