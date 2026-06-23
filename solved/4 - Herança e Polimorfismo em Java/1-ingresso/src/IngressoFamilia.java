public non-sealed class IngressoFamilia extends Ticket {

    private int quantidadePessoas;

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double getValor() {
        double total = super.getValor() * quantidadePessoas;
        return quantidadePessoas > 3 ? total * 0.95 : total;
    }
}
