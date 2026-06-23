public non-sealed class UserAtendente extends User {

    private double valorCaixa;
    private final boolean isAdmin = false;

    public UserAtendente(String name, String email, String password) {
        super(name, email, password);
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void receberPagamento(double valor) {
        this.valorCaixa += valor;
        System.out.println("Pagamento recebido. Valor em caixa: " + valorCaixa);
    }

    public String fecharCaixa() {
        double total = valorCaixa;
        this.valorCaixa = 0;
        return "Caixa fechado. Total caixa: " + total;
    }
}
