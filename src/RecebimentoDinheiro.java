public class RecebimentoDinheiro implements Recebimento {
    private String formaRecebimento;
    private int parcelas;
    private double valor;

    public RecebimentoDinheiro(String formaRecebimento, double valor) {
        this.formaRecebimento = formaRecebimento;
        this.parcelas = 1; // Pagamento em dinheiro geralmente é em uma parcela
        this.valor = valor;
    }

    @Override
    public String getFormaRecebimento() {
        return formaRecebimento;
    }

    @Override
    public int getParcelas() {
        return parcelas;
    }

    @Override
    public double getValor() {
        return valor;
    }
}
