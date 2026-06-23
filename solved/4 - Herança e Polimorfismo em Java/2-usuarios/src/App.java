public class App {
    public static void main(String[] args) {
        // Gerente
        System.out.println("======GERENTE======");
        UserGerente gerente = new UserGerente("Carlos", "carlos@empresa.com", "senha123");
        System.out.println(gerente.login("carlos@empresa.com", "senha123"));
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();
        System.out.println(gerente.logoff());

        // Vendedor
        System.out.println("======VENDEDOR======");
        UserVendedor vendedor = new UserVendedor("Ana", "ana@empresa.com", "abc456");
        System.out.println(vendedor.login("ana@empresa.com", "abc456"));
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        System.out.println(vendedor.logoff());

        // Atendente
        System.out.println("======ATENDENTE======");
        UserAtendente atendente = new UserAtendente("João", "joao@empresa.com", "xyz789");
        System.out.println(atendente.login("joao@empresa.com", "xyz789"));
        atendente.receberPagamento(150.0);
        atendente.receberPagamento(80.50);
        System.out.println(atendente.fecharCaixa());
        System.out.println(atendente.logoff());
    }
}
