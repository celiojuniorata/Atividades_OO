public class RecebimentoCartao implements Recebimento {
    private String formaRecebimento;
    private int parcelas;
    private double valor;

    public RecebimentoCartao(String formaRecebimento, int parcelas, double valor) {
        this.formaRecebimento = formaRecebimento;
        this.parcelas = parcelas;
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
