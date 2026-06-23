public non-sealed class UserGerente extends User {

    private final boolean isAdmin = true;

    public UserGerente(String name, String email, String password) {
        super(name, email, password);
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório financeiro gerado.");
    }

    public void consultarVendas() {
        System.out.println("Consulta de vendas realizada.");
    }
}
