public non-sealed class UserVendedor extends User {

    private int quantidadeVendas;
    private final boolean isAdmin = false;

    public UserVendedor(String name, String email, String password) {
        super(name, email, password);
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void realizarVenda() {
        this.quantidadeVendas++;
        System.out.println("Venda realizada. Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Quantidade de vendas: " + quantidadeVendas);
    }
}
