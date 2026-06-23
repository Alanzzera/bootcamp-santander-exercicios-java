public class App {
    public static void main(String[] args) throws Exception {
        // Ticket normal
        Ticket ticket = new Ticket();
        ticket.setFilme("Avatar");
        ticket.setAudio("Dublado");
        ticket.setValor(20);
        System.out.println("Ticket normal: R$" + ticket.getValor());

        // Meia entrada
        MeiaEntrada meia = new MeiaEntrada();
        meia.setFilme("Avatar");
        meia.setAudio("Legendado");
        meia.setValor(20);
        System.out.println("Meia entrada: R$" + meia.getValor());

        // Família com 4 pessoas (deve ter 5% de desconto)
        IngressoFamilia familia = new IngressoFamilia();
        familia.setFilme("Avatar");
        familia.setAudio("Dublado");
        familia.setValor(20);
        familia.setQuantidadePessoas(4);
        System.out.printf("Família (%s pessoas): R$ %s", familia.getQuantidadePessoas(), familia.getValor());
    }
}